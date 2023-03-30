package entities;

public class Account {
    private int numeroConta;
    private String holder;
    private double balance;

    public Account(){

    }

    public Account(int numeroConta, String holder, double initialDeposit) {
        this.numeroConta = numeroConta;
        this.holder = holder;
        deposit(initialDeposit);
    }


    public Account(int numeroConta, String holder) {
        this.numeroConta = numeroConta;
        this.holder = holder;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public String getHolder() {
        return holder;
    }


    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }   

    public void withdraw(double amount){
        this.balance -= (5 + amount);
    }

    public String toString() {
      return "Account " + numeroConta + ", holder: " + holder
        + ", Balance: $ " + String.format("%.2f", balance);
    }

    
    

    
}
