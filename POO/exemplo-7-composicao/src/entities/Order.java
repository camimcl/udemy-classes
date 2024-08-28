package entities;

import enums.entities.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    List <OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Order() {}

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }
    public double total(){
        double total = 0;
        for(OrderItem item : orderItems){
            total += item.subTotal();
        }
        return total;
    }
@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+sdf.format(moment)+"\n");
        sb.append("Order Status: "+status+"\n");
        sb.append("Client: "+client);
        sb.append("Order Items: \n");
        for(OrderItem item : orderItems){
            sb.append(item);
        }
        sb.append("Total price: "+total()+"\n");

        return sb.toString();
    }

}
