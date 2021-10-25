package com.test;

public class Ex08_8 {

	public static void main(String[] args) {
		
		//1. 기본형을 Wrapper로 변경
		int num =10;
		Integer x = new Integer(num);
		Object[] obj = new Object[10];
		int x2=x.intValue();
				System.out.println(x2);

	}

}
