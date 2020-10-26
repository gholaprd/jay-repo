package com.coforge.jay;

public class FibonacciSeries {
	
	public static void getFibonacci(int num) {
		int a=0,b=0,c=1;
		
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a);
		}
	}

	public static void main(String[] args) {
		getFibonacci(10);
	}

}
