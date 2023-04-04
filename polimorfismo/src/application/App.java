package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account x = new Account(0001, "Well", 500.0);
        Account y = new SavingsAccount(0002, "Rafa", 500.0, 0.06);

        x.withdraw(100.0);
        y.withdraw(100.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
