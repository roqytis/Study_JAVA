package com.test;

import java.util.Arrays;

public class Ex07_8 {

	public static void main(String[] args) {
		
	Person p= new Person("홍길동",20);
	Person p2= new Person("이순신",44);
	Person p3= new Person("유관순",18);
	Person p4= new Person("강감찬",66);
	Person[] ps = {p,p2,p3,p4};
		
	Arrays.sort(ps,new PersonComp());
	for(Person person :ps) {
	System.out.println(person);
	}

	}

}
