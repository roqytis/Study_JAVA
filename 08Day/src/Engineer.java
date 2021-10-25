
public class Engineer extends Employee {

	String skill;

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String ssn, String name, String salary, String skill) {
		super(ssn,name,salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getEmployee() {
		System.out.println(super.name+"\t"+this.name+"==========");
		return super.getEmployee()+"\t"+this.skill;
	}
	
	
 }

