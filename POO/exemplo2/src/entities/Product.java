package entities;

public class Product {
    public String name;
    public double price;
    public int Quantity;

    public double totalValueInStock(){
        return Quantity * price;
    }
    public void addProducts(int quantity){
        this.Quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.Quantity -= quantity;
    }

    //metodo tostring já existe na classe object, sendo sobreposto agora na classe product.
    public String toString(){
        return name
                +", $ "
                +String.format("%.2f", price)  //so pra vir c 2 casas decimais
                + ", "
                +Quantity
                + " units, Total: $"
                +String.format("%.2f",totalValueInStock());
    }
}
