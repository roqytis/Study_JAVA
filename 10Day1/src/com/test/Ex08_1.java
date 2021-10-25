package com.test;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = new String("Hello");
       String str2 = new String("Hello");
       String str3="Hello";
       String str4="Hello";
       
     
       System.out.println(str==str2);
       System.out.println(str3==str4);
       
       if (str.equals(str2)) {
    	   System.out.println("str 과  str2 는 같다");
		
	}
	}

}
