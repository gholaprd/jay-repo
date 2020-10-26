package com.coforge.jay;

public class ArraysDemo {

	private  class A {
		public  void main(String[] args) {
			
		}

	}

	public static void main(String[] args) {

		int[] a = new int[4];
		// int[5] a1 = new int[4];
		// int[] a2 = new int[4L];
		// int[] a3 = new int[4.02];
		int[] a4 = new int['a'];

		Object obj = new int[] { 1, 2, 3 };
		int[] someArray = (int[]) obj;
		for (int i : someArray) {
			System.out.print(" " + i);
		}
	}

}
