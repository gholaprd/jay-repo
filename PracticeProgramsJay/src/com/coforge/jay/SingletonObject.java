package com.coforge.jay;

public class SingletonObject {
	
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		return instance;
	}
	public void getMessage() {
		System.out.println("Hi Good Morning");
	}
	
}
