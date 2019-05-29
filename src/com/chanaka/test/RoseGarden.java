package com.chanaka.test;

import java.util.ArrayList;

public class RoseGarden{
	public static ArrayList<Rose> roses;
	
	static {
		// Prints One / call before the anonimus block
		System.out.println("Static Block");
	}
	
	{
		//Prints per object / Call before the constructor 
		System.out.println("Anonimus Block");
	}
	
	public RoseGarden() {
		//Prints per Object
		System.out.println("Constructor");
	}
	
}

/*public class RoseGarden {
	public static ArrayList <Rose> roses;
	
	static {
		roses = new ArrayList<>();
		roses.add(new Rose("Red","Lover Rose"));
		roses.add(new Rose("white","Friendship Rose"));
		roses.add(new Rose("Pink","Rose"));
	}
	
	{
		roses = new ArrayList<>();
		roses.add(new Rose("Red","Lovers Rose"));
	}
	
	public RoseGarden() {
		
	}
	
	public RoseGarden(String name, String color, int nor) {
		for(int x = 0; x<nor; x++) {
			roses.add(new Rose(color,name));
		}
		
	}
	
	
}
*/