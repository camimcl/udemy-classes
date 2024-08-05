package application;

import entities.enums.WorkerLevel;
import program.entities.Department;
import program.entities.HourContract;
import program.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name:");
        String department = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary:");
        double baseSalary = sc.nextDouble();
        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();
        sc.nextLine();

        //department tem que ser instanciado para poder passar o string departmentname
        Worker worker = new Worker(name,WorkerLevel.valueOf(level),baseSalary,new Department(department));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 1; i <= n ; i++) {
            System.out.println("Enter the data of the #"+i+" contract:");
            System.out.println("Date(DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration(hours):");
            int duration = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(contractDate,valuePerHour,duration);
            worker.addContract(contract);
        }
        System.out.println("Enter month and year to calculate income(MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " +worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear +": " +String.format("%.2f",worker.income(year,month)));
        sc.close();
    }
}
