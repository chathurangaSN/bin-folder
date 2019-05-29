package com.genericExample;

public class Print <T extends MainAccounts>{

	T t;
	
	public void sePrint(T t) {
		this.t=t;
	}
	
	public void calculate(Double amount) {
		Double temp = amount+ amount * t.intrest();
		System.out.println("Account Type :"+t.accountType()+"\nIntrest :"+t.intrest()+"\nAmount with intrest :"+temp);
	}
	
}
