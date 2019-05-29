package com.genericExample;

public class Account {
	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount();
		Print<CurrentAccount> print = new Print<CurrentAccount>();
		print.sePrint(currentAccount);
		print.calculate(1200.00);
		
		SavingAccount savingAccount = new SavingAccount();
		Print<SavingAccount> print2 = new Print<SavingAccount>();
		
		print2.calculate(5400.00);
	}

}
