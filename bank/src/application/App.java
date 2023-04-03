package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.next();

        System.out.print("Is there an initial deposit (y/n)?: ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDepositValue);
            
        }else if (response == 'n'){
            account = new Account(accountNumber, accountHolder);
        } else {
            System.out.println("IN VALIDO MIGAAAO");
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account.toString());
        System.out.println();
        System.out.print("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Updated account data: ");
            System.out.println(account.toString());
            System.out.println("--------------------------");

            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            System.out.println("Updated account data: ");
            System.out.println(account.toString());

        



        sc.close();
    }
}
