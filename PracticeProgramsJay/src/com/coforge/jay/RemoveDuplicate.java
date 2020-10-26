package com.coforge.jay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		System.out.println(list);
		//create new HashSet
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
//		set.addAll(list);
//		list.clear();
//		list.addAll(set);
//		System.out.println(list);
	}

}
