
public class Manager extends Employee {

	String depart; //관리부서
	public Manager() {
		// Employee의 생성자가 호출됨
		super("A","b","c");//부모의 매개변수 3개짜리 명시적 호출
		System.out.println("Manager 기본생성자");
	}
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
