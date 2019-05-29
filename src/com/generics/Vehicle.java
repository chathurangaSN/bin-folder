package com.generics;

public class Vehicle <T> {
	T a;
	
	public Vehicle(T t) {
		this.a = t;
	}
	
	public void drive() {
		System.out.println("I'm Drivimng"+a.toString());
	}

}
