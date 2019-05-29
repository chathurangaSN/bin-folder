package com.chanaka;

public class AccountTest {
	public static void main(String[] args) {
		Operation operation = new Operation();
		try {
			//operation.save(10.0);
			operation.get(20, -1000);
		}catch (AccountException e) {
			e.printStackTrace();
		}
		
	}
}
