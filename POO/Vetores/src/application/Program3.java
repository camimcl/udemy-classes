package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be typed? ");
        int n = sc.nextInt();

            double heightSum = 0.0;
            double mediumHeight;
            int count = 0;


        Person[] people = new Person[n];
        for (int i = 0; i < people.length; i++) {
            sc.nextLine();
            System.out.println("Data of the " + (1+i)+ " person");
            System.out.println("NAME: ");
            String name = sc.nextLine();
            System.out.println("AGE: ");
            int age = sc.nextInt();
            System.out.println("HEIGHT: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);
            if (people[i].getAge() < 16) {
                count = count +1;
            }

            heightSum += people[i].getHeight();

        }

        mediumHeight = heightSum / people.length;
        double percentage =  count * 100.0/n;
        System.out.printf("Height media: %.2f\n",mediumHeight);
        System.out.printf("People with less than 16 yo: %.1f%%%n",percentage);

        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }

        sc.close();


    }
}
