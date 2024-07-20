package entities;

public class  BankAccount {
    private String holderName;
    private double balance;
    private int accountNumber;

    public BankAccount(String holderName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public BankAccount(String holderName, double inicialDeposit, int accountNumber) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        deposit(inicialDeposit);
    }

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
         this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if(amount == 0 ){
            balance +=amount;
        }
        else {
            balance -= (amount + 5);
        }
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String toString(){
       return
               "Account "
               + getAccountNumber()
               +", Holder: "
               + getHolderName()
               +", Balance: $ "
               +String.format("%.2f", getBalance());

    }
}
