package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Locale.setDefault(Locale.US);

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area: %.2f" , rectangle.Area());
        System.out.println();
        System.out.printf("Perimeter: %.2f" , rectangle.Perimeter());
        System.out.println();
        System.out.printf("Diagonal: %.2f", rectangle.Diagonal());
    }
}