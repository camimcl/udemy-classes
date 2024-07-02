package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //sem usar programação orientada a objeto
        //pra usar "." inves de ","
        Locale.setDefault(Locale.US);

//        double xA,xB,xC;
//        double yA,yB,yC; ----> usando poo(importa pacote)

          Triangle x,y;
          x = new Triangle();
          y = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

//        double p = (x.a + x.b + x.c)/2;
//        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b)  * (p - x.c));
          double areaX = x.area();

        //substituindo a operação de P
//      p = (y.a + y.b + y.c)/2;
//      double areaY = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
