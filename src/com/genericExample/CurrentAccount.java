package com.genericExample;

public class CurrentAccount implements MainAccounts{

	@Override
	public String accountType() {
		return "Current Account";
	}

	@Override
	public double intrest() {
		return 13.00;
	}

}
