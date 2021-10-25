
public class Engineer extends Employee {

	String skill;
	
	public Engineer() {
		super();   //부모 기본생성자 호출
		System.out.println("Engineer  기본생성자");
	}
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
}
