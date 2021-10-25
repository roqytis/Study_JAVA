
public class Manager extends Employee{

	String depart;

	public Manager(String ssn, String name, String salary, String skill) {
		super(ssn,name,salary);
		this.depart = depart;
	}
		
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee();
	}
	
	
}
