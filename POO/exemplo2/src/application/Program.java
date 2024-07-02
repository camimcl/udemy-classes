package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product productA = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        productA.name = sc.nextLine();
        System.out.println("Price: ");
        productA.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        productA.Quantity = sc.nextInt();

        //System.out.println("Product Data: "+productA.name+", $ " +productA.price + ", " + productA.Quantity + " units, Total: $" + productA.totalValueInStock());
        System.out.println("Product data: "+productA); //metodo tostring implicitamente sendo chamado

        System.out.println("Enter the number of products to be added in Stock: ");
        int quantity = sc.nextInt();
        productA.addProducts(quantity);

        System.out.println("Updated data: "+productA);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        productA.removeProducts(quantity);

        System.out.println("Updated data: " +productA);

        sc.close();
    }
}
