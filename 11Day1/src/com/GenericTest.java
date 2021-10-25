package com;

import java.util.Date;

class Box{
	Object obj;

		public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return this.obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		//일반적인타입(raw type)
		Box b=new Box();
		b.setValue("hello");
        String x=(String)b.getValue();
        System.out.println(x);    
	
	Box b2 = new Box();
	b2.setValue(new Date());
	Date d=(Date)b2.getValue();
	System.out.println(d);
	
	Box b3 =new Box();
	b3.setValue(100);
	b3.setValue(100);
	b3.setValue(100);
	b3.setValue("aaa");
	System.out.println(b3.getValue());
	
	
	}

}
