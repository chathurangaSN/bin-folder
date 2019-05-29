package com.chanaka;

public class Operation {
	public void save(Double amount) {
		
		
		SavingsAccount savingsAccount = new SavingsAccount();
		try {
			savingsAccount.deposit(amount);
			return;
		} catch (AccountException e) {
			amount = amount*(-1);
		}
		try {
			savingsAccount.deposit(amount);
		} catch (AccountException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void get(double amount, double balance) throws AccountException {
		SavingsAccount savingsAccount = new SavingsAccount();
		try {
			savingsAccount.withdraw(amount, balance);
		} catch (AcccountValidationException e) {
			throw new AccountException("Account Validation Fail", e);
		}
	}
}