package entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
        super(); //para reutilizar alguma logica do construtor padrao da superclasse caso tenha
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance+= amount - 10.0 ;
        }
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
