package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
         //**vetores do tipo classe**
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//Tambem pode usar vect.length inves dessa variavel
        Product[] products = new Product[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name,price);
            sum += products[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("sum : %.2f%n",sum);
        System.out.printf("avg: %.2f%n",avg);

        //exercicio negativas
        System.out.println("How many numbers will u type? ");
        int num  = sc.nextInt();

        int [] numbers = new int[num];
        for(int i = 0 ;i < numbers.length ; i++){
            System.out.println("Type a number: ");
            numbers[i] = sc.nextInt();
        }
            System.out.println("Negative numbers: ");
        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }
        sc.close();
    }
}
