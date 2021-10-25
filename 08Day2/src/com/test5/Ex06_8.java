package com.test5;
class Test{
	public static void taxRate(Employee e) {//다형성 매개변수
		if (e instanceof Manager) {
			Manager m=(Manager)e;
			System.out.println("Manager 세금 구하기");
		} else if (e instanceof Engineer) {
			Engineer en =(Engineer)e;
			System.out.println("Engeineer 세금구하기");
		} else if(e instanceof Employee) {
			System.out.println("Employee 세금 구하기");
		}
	}
}

class Employee{}
class Manager extends Employee{}
class Engineer extends Employee{}


public class Ex06_8 {
     public static void main(String[] args) {
    	 
    	 Employee emp=new Employee();
    	 Test.taxRate(emp);
    	 Manager man=new  Manager();
         Test.taxRate(man);
    	 Engineer eng=new Engineer();
         Test.taxRate(eng);
    	 Employee tt=new Engineer();
    	 Test.taxRate(tt);
//    	 emp.taxRate(emp);
//    	 man.taxRate(man);
//    	 eng.taxRate(eng);
    	 
     }
}
