package com.genericExample;

public class SavingAccount implements MainAccounts{

	@Override
	public String accountType() {
		return "Saving Account";
	}
	
	@Override
	public double intrest() {
		return 	20.3;
	}
}
