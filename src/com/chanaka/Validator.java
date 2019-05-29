package com.chanaka;

public class Validator {
	public boolean validate(double balance, double amount) throws AccountOverDueException {
		if(balance < 0) {
			throw new AccountOverDueException("Balance is Not sufficent");
		}else {
			return true;
		}
	}
}
