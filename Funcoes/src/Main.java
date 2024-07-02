import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //faça um programa para ler 3 numeros e mostrar na tela o maior entre eles.

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 Números");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //exemplo de uso dos condicionais de maneira mais eficiente:

        if (a > b && a > c){
            System.out.println("O maior número é A: "+a);
        }
        else if(b > c) {
            System.out.println("O maior número é B: "+b);
        }
        else{
            System.out.println("O maior número é C: "+c);
        }

        //para delegar a logica e usar uma função:

        int higher = max(a,b,c);
        showResult(higher);

        scan.close();

    }
    //public = pode ser vista por outras classes
    //static = pode ser chamada independente de criação de objeto
    public static int max (int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        //esse max é uma função do java, retorna o maior numero entre dois inteiros
        else aux = Math.max(y, z);
        return aux;
    }
    //usa-se void quando a função faz uma ação sem retornar nenhum valor para uso no programa
    public static void showResult(int value){
        System.out.println("O maior número é: "+value);
    }
}