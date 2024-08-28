package entities;

public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Product: " + this.product.getName());
        sb.append(", Quantity: " + this.quantity);
        sb.append(", Price: " + String.format("%.2f",this.product.getPrice()));
        sb.append(", Subtotal: $"+String.format("%.2f",subTotal())+"\n");

            return sb.toString();

    }
}
