
public class Employee {

	String ssn;
	String name;
	String address;
//생성자 추가부분/////////////////////////////////////////////
public Employee(String ssn, String name, String address) {
		super();
		System.out.println("Employee 생성자 호출=====================");
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		System.out.println("Employee 기본생성자");
	}
//////////////////////////////////////////////////
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
