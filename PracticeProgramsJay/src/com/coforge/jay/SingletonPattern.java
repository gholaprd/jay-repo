package com.coforge.jay;

import java.io.Serializable;

public class SingletonPattern implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static volatile SingletonPattern instance;

	private SingletonPattern() {
		// no code;
	}

	public static SingletonPattern getInstance() {

		if (instance == null) { //first check
			synchronized (SingletonPattern.class) {
				
				if (instance == null) { //double check
					instance = new SingletonPattern();
				}
			}
		}
		return instance;
	}

	private Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
