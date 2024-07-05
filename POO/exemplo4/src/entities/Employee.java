package entities;

public class Employee {
    public String name;
    public double grossSalary,Tax;

    public double NetSalary(){
        return grossSalary - Tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary*percentage/100;
    }
    public String toString(){
        return
                name
                +" , $ "
                +String.format("%.2f",NetSalary());
    }

}
