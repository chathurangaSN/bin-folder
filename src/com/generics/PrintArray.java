package com.generics;

public class PrintArray {
	
	public <E> void print(E[] e) {
		
		for (E e2 : e) {
			System.out.print(e2);
		}
	}

}
