package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();
        Locale.setDefault(Locale.US);

        System.out.println("Name: ");
        stud.name = sc.nextLine();
        System.out.println("Enter your 3 grades of the trimester: ");
        stud.grade1 = sc.nextDouble();
        stud.grade2 = sc.nextDouble();
        stud.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f ",stud.finalGrade());
        System.out.println();

        if(stud.finalGrade()<60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n ",stud.missingPoints());

        }
        else{
            System.out.println("PASS");
        }

        sc.close();

    }
}
