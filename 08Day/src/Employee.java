
public class Employee  {

	String ssn;
	String name;
	String salary;
	public Employee() {
		super();
	
	}
	public Employee(String ssn, String name, String salary) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.salary = salary;
	}
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getEmployee() {
		return this.ssn+"\t"+this.name+"\t"+this.salary;
	}
	
	
	

 }
