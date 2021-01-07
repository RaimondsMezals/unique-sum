package com.qa.main;

public class Runner {

	
	
	public static void main(String[] args) {
		
		UniqueNum un = new UniqueNum();
		
		System.out.println(un.unique(1, 2, 3));
		System.out.println(un.unique(3, 3, 3));
		System.out.println(un.unique(1, 1, 2));
		
	}

}
