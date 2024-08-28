package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.entities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date(dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.nextLine());

        System.out.println("Enter order data:");
        System.out.print("Status:");
        String status = sc.nextLine();

        Order o1 = new Order(new Date(),OrderStatus.valueOf(status),new Client(name,email,birthDate));

        System.out.print("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #"+i+" item data:");
            System.out.println("Product name: ");
            String productName = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName,price);

            OrderItem orderItem = new OrderItem(quantity,product);

            o1.addItem(orderItem);

        }

        System.out.println("Order Summary:");
        System.out.println(o1);

        sc.close();

    }
}
