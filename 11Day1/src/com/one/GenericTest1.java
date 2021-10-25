package com.one;

import java.util.Date;

class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj =obj;
	}
   public T getValue() {
	   return obj;
   }
}

public class GenericTest1 {

	public static void main(String[] args) {
		//제네릭스 타입
    Box<String>b =new Box<String>();
    b.setValue("hello");
    //b.setValue(new Date());
    String x= b.getValue();
    
    System.out.println(x);
    
    
    Box<Date> b2 =new Box<>();
    b2.setValue(new Date());
    //  b2.setValue("aaaa");
    Date d= b2.getValue();
    System.out.println(d);
	
	Box<Integer> b3 =new Box<>();
	b3.setValue(100);
	int xxx =b3.getValue();
	System.out.println(xxx);
	
	}

}
