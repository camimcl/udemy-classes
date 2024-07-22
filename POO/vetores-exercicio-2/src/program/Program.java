package program;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();


        Rent[] rooms = new Rent[10];

        for(int i=1; i<=n; i++){
            System.out.println("Rent #"+i+":");

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room:");
            int room = sc.nextInt();
            sc.nextLine();
            if(rooms[room]==null){
                rooms[room] = new Rent(name,email);
            }
        }

        System.out.println("Busy Rooms:");
        for(int i=0; i< rooms.length;i++){
            if (rooms[i] != null) {
                System.out.println(i+": "+rooms[i]);
            }

        }





    }
}
