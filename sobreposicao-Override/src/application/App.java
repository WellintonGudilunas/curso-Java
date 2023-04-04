package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc1 = new Account(1200, "Well", 2000.0);
        acc1.withdraw(600.0);
        System.out.println("\n" + acc1.getBalance());

        Account acc2 = new SavingsAccount(1300, "Rafa", 4000.0, 0.06);
        acc2.withdraw(700.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1400, "Gud", 6000.0, 1000.0);
        acc3.withdraw(400);
        System.out.println(acc3.getBalance() + "\n");
    }
}
