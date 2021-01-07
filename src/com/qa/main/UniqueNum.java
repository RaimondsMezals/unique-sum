package com.qa.main;

public class UniqueNum {
	
	public int unique(int a, int b, int c) {
		
		int result = 0;
		
		if(a != b && a != c && b != c) {
			
			result = a + b + c;
			
		}else if(a != b && a != c && b == c) {
			
			result = a + b;
			
		}else if(a == b && a != c && b != c) {
			
			result = a + c;
			
		}else {
			
			result = a;
			
		}
		
		
		return result;
	}
	
}
