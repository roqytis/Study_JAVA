package com.test;

import java.util.Comparator;

public class PersonComp implements Comparator<Person>{

 
	 public int compare (Person o1,Person o2) {
	
	int result =1;
	if(o1.age >= o2.age)result =-1;
	return result;
	 }

}
