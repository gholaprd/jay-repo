package com.coforge.jay;

@FunctionalInterface
public interface MyInterface {

	public abstract void firstMethod();
	
	default void secondMethod() {
		System.out.println("its default Method");
	}

	public static void thirdMethod() {
		System.out.println("it's static method");
	}

}
