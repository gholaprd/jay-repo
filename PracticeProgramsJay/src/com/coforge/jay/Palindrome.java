package com.coforge.jay;

public class Palindrome {

	public static void checkPalinDrome(String str) {
		String original = str, reverse;
		reverse = reverseString(str);
		if (original.equals(reverse)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
	}

	public static String reverseString(String str) {
		StringBuffer buffer = new StringBuffer();
		int length = str.length();
		while (length > 0) {
			char charAt = str.charAt(length - 1);
			buffer = buffer.append(charAt);
			--length;
		}
		return new String(buffer);
	}

	public static void main(String[] args) {

		checkPalinDrome("wwwwwwwwwwwwwww");
		MyInterface i = () -> {
			System.out.println("its firstMethod implementation");
		};
		//i.firstMethod();
		MyInterface.thirdMethod();
		i.secondMethod();
	}

}
