package com.coforge.jay;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "Jay";
		String concat = str.concat("");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(concat));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
		System.out.println(System.identityHashCode((str+"")));
	}

}
