package com.chanaka;

import java.math.BigDecimal;

public class SavingsAccount {
	public void deposit(Double amount) throws AccountException {
		/*
		 * BigDecimal x = new BigDecimal(0); Integer i=0;
		 */

		if (amount <= 0) {
			throw new AccountException("Value cannot be less than zero");
		} else {
			System.out.println("Deposit Completed");
		}
	}

	public void withdraw(Double amount, Double balance) throws AcccountValidationException {
		Validator validator = new Validator();
		try {
			if (validator.validate(balance, amount)) {
				System.out.println("SucessFull");
			}
		} catch (AccountOverDueException e) {
			throw new AcccountValidationException("Balance is Zero", e);
		}
	}
}