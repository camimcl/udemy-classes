package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
//        String comment;
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Title:");
//        String title = sc.nextLine();
//        System.out.println("Date (DD/MM/YYYY):");
//        System.out.println("Likes:");
//        int likes = sc.nextInt();
//        String d = sc.nextLine();
//        System.out.println("Description:");
//        String content = sc.nextLine();
//        System.out.println("How many Comments ?");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Enter comment #" + i + ":");
//            comment = sc.nextLine();
//        }
        //hard code:
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = sdf.parse(d);
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment ("Wow that's awesome!");
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Travelling to New Zealand",
                "I'm going to visit this wonderful country",
                12);
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);




    }
}
