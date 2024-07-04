package entities;

public class Employee {
    public String name;
    public double grossSalary,Tax;

    public double NetSalary(){
        return grossSalary - Tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary / percentage;
    }
    public String toString(){
        return
                name
                +" , $ "
                +String.format("%.2f",grossSalary);
    }

}
