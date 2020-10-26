package com.coforge.jay;

public class SignletonTest {

	public static void main(String[] args) {
		SingletonPattern instance = SingletonPattern.getInstance();
		SingletonPattern instance1 = SingletonPattern.getInstance();
		SingletonPattern instance2 = SingletonPattern.getInstance();
		
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
