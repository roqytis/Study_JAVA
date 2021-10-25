package com.test;

public class Ex05_12_1 {
  int num=100;
 public static void change(int num) {//함수의 매개변수 중 기본타입은
	System.out.println("1번호출==============");
	 //call by value 이다
	 num=20;
 }	
 //함수를 오버로딩
 public static void change( Ex05_12_1 ex) {//함수의 매개변수 중 기본타입은
	 System.out.println("2번호출==============");
	 //call by ref 이다
	 ex.num=200;
 }	
 //함수를 오버로딩
 public static Ex05_12_1 change2( Ex05_12_1 ex) {//함수의 매개변수 중 기본타입은
	 Ex05_12_1 test=ex;
	 test.num=500;
	 return test;
 }	
	
public static void main(String[] args) {
	
	int num=10;
	System.out.println("change 하수 호출전=========="+ num);
	change(num);// static 메소드를 같은 클래스 안에서 객체 생성 필요없이 바로 호출 사용
	System.out.println("change 함수 호출 후 num========"+num);
    Ex05_12_1 t= new Ex05_12_1();
    System.out.println("객체생성 num===="+ t.num);// 100
    change(t);
    System.out.println("change 호출 후 num===="+ t.num);//
    change(t.num);//200
    System.out.println("change호출 후 num======"+ t.num);
    Ex05_12_1 t2=change2(t);
    System.out.println("change호출 후 num======"+ t2.num);//500
    System.out.println("change호출 후 num======"+ t.num);//500
    
 }

}
