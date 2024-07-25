package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        System.out.println("enter the number of rows and cols");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int [][] matriz = new int[rows][cols];
        System.out.println("Enter the numbers");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length ; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }

        }
            int x = sc.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}
