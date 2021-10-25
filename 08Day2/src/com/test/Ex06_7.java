package com.test;

class Employee{
	 String name;
	 int salalry;
	 public String getEmployee() {
		 return name+" "+ salalry;
	 }
	
	 public Employee() {
		}

	public Employee(String name, int salalry) {
		super();
		this.name = name;
		this.salalry = salalry;
	}


}

class Manager extends Employee{
	String depart;

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+ " "+ depart;
	}

	public Manager(String name, int salary, String depart) {
		super(name,salary);
		this.depart = depart;
	}
	public void test() {//자식의 유일함수
		System.out.println("manager.test() 호출됨==========================");
	}
}

public class Ex06_7 {

	public static void main(String[] args) {
		
		Employee emp= new Employee("홍길동", 2000);
	    System.out.println(emp.getEmployee());
	    
	    emp  = new Manager("이순신", 4000, "개발");
	   System.out.println(emp.getEmployee());
       //emp.depart; 접근 자신의 타입변수, 함수만 가능,
	   Manager m=(Manager)emp; //임플로이 이엠피 타입을 매니져 타입으로 형변환 
	   System.out.println(m.name+"\n"+m.salalry+"\n"+m.depart);
	}

}
