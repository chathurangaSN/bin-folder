package com.generics;

public class Application {
	public static void main(String[] args) {
			Car car = new Car();
			Maruti m = new Maruti();
			Vehicle<Car> vehicle = new Vehicle<Car>(m);
			vehicle.drive();
			
			Jeep jeep = new Jeep();
			Vehicle<Jeep> vehicle2 = new Vehicle<>(m);
			vehicle2.drive();
			/*
			PrintArray printArray = new PrintArray();
			Integer arr[] = {1,2,2,4,5};
			String s[] = {"a", "b", "c"};
			printArray.print(arr);
			System.out.println();
			printArray.print(s);
			*/
			
	}
}
