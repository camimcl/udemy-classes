package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount; //deixa criado fora do escopo mas sem instanciar
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit? (Y/N): ");
        char answer = sc.next().charAt(0);
        if(answer == toLowerCase('Y')){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            //instancia com 3 parametros
            bankAccount = new BankAccount(holder,initialDeposit,accountNumber);
        }
        else{
            //instancia com 2 parametros
            bankAccount = new BankAccount(holder,accountNumber);
        }

        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.println("Enter a deposit value: ");
        bankAccount.deposit(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println("Enter a withdraw value: ");
        bankAccount.withdraw(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}
