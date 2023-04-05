package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(001, "Well", 1200.0, 0.22));
		list.add(new BusinessAccount(002, "Rafa", 1300.0, 2000.0));
		list.add(new SavingsAccount(003, "Good", 1000.0, 0.50));
		list.add(new BusinessAccount(004, "Tora", 2000.0, 40000.0));

		double sum = 0.0;

		for(Account acc : list){
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f \n", sum);

		for(Account acc : list){
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f \n", acc.getNumber(), acc.getBalance());
		}

		
		
	}
}