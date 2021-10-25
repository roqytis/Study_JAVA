package com.test;

public class Person {

	String name;
	int age;
	
	
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	
}
