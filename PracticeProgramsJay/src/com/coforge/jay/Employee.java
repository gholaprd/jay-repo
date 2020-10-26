package com.coforge.jay;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private int age;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Employee(int id, String name, int age) {
		this();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "jay", 30);
		Employee emp2 = new Employee(222, "prakash", 25);
		Employee emp3 = new Employee(333, "kumar", 20);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		List<String> collect3 = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(collect3);

		Predicate<Integer> p = (a) -> a % 2 == 0;
		p.test(22);

		System.out.println(empList);
		List<Employee> collect = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(collect);
		Map<Integer, String> map = empList.stream().collect(
				Collectors.toMap(Employee::getId, Employee::getName, (x, y) -> x + ", " + y, LinkedHashMap::new));
		empList.sort((Employee s1, Employee s2) -> s1.getAge() - s2.getAge());
		System.out.println(empList);
		TreeSet set = new TreeSet<>();
		set.add(10);
		set.add(2);
		set.add(21);
		set.add(0);
		TreeSet set1 = new TreeSet<>();
		set1.add("jay");
		set1.add("rd");
		NavigableSet descendingSet2 = set1.descendingSet();
		System.out.println(descendingSet2);
		System.out.println(set1);
		NavigableSet descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		System.out.println(set);
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(21);
		list.add(0);
		List<Integer> collect2 = list.stream().sorted().collect(Collectors.toList());
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		System.out.println(collect2);

		Map<String, Integer> unsortMap = new HashMap<>();
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "RD");
		String put = map1.put(1, "Jay");
		System.out.println(put);
		System.out.println(map1);
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		// 1. Auto Configuration by using annotation @EnableAutoConfiguration like Mysql
		// db auto-configure
		// 2. Dependency Management Dependency version and combination
		// 3. Openiated Approach SB ask to follow some rulse
		// 4. Embbeded Server
		// 5. Spring Actuator --monitoring and metrices
		// 6. CLI tool

		System.out.println("Original...");
		System.out.println(unsortMap);
		Thread thread = new Thread();
		State state = thread.getState();
		// Collections.
		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the
		// order.
		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		System.out.println(result);

	}

}
