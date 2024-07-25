package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int x = sc.nextInt();
        sc.nextLine();

        List <Employee> list = new ArrayList<>();


        for (int i = 0; i < x ; i++) {
            System.out.println("Employee #"+(i+1)+":");

            System.out.println("ID:");
            int id = sc.nextInt();
            sc.nextLine();
            //se o id ja existe na lista
            while(hasId(list,id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Salary:");
            Double salary = sc.nextDouble();

            list.add(i,new Employee(name,id,salary));
        }


        System.out.println("Enter the employee id that will have salary increase:");
        int id = sc.nextInt();
        sc.nextLine();
        Employee emp = list.stream().filter(y ->y.getId() == id).findFirst().orElse(null);
        //leitura: stream para aceitar o predicado a funcao lambda -->
        // filter para filtrar pelo predicado
        //predicado = quero os elementos x, tal que o x.getId == id,
        // .findFirst para pegar o primeiro, se ele nao exstir .orElse(null)

        //  int pos = position(list, id);
        //  pos == -1
        if(emp == null){
            System.out.println("This id does not exist");
        }
        else{
            System.out.println("Enter the percentage:");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
//            list.get(pos).increaseSalary(percent);
        }


        System.out.println("List of employees:");
        for (int i = 0; i < x; i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }
    public static int position(List<Employee> list,int id){
        for(int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
            return -1;
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x ->x.getId() == id).findFirst().orElse(null);
        return emp != null; //se o funcionario encontrado for diferente de nulo, foi encontrado
        //retorna true se for encontrado e false se for null
    }

}

