package com.coforge.jay;

import java.util.Arrays;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Jay","Prakash","Kumar");
		String string = list.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(string);
	}
}
class TradingSystem {

    private static String category = "electronic trading system";
    public static void main(String[] args) {
        TradingSystem system = null;
        System.out.println(system.category);
    }
}