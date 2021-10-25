
public class Test {

	public static void main(String[] args) {
		Manager m= new Manager();
		m.setName("홍길동");
		m.setAddress("서울");
		m.setDepart("영업부");
		m.setSsn("1234");
		System.out.println("Manager : "+ m.getName()+"\t"+m.getSsn()+"\t"+m.getAddress()
		+"\t"+m.getDepart());
		Engineer e= new Engineer();
		e.setName("이순신");
		e.setAddress("경기");
		e.setSsn("1234");
		e.setSkill("전자공학");
		System.out.println("Engineer : "+e.getName()+"\t"+e.getSsn()+"\t"+e.getAddress()
		+"\t"+e.getSkill());
		

	}

}
