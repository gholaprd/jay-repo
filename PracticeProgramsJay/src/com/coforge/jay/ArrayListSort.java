package com.coforge.jay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(9);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(7);
		list.add(7);
		
		System.out.println(list);
//		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(collect);
		//removing duplicate using HashSet
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.addAll(list);
		
		System.out.println(hashSet);
		
		//removing duplicate using LinkedHashSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(list);
		
		System.out.println(linkedHashSet);
		
		
		Collections.sort(list);
		//Arrays.sort(list);
		System.out.println(list);

	}

}
