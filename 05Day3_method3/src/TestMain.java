
public class TestMain {

	public static void main(String[] args) {
		Person p1= new Person("홍길동",10);
        System.out.println(p1.toString());
        Person p2= new Person();
        System.out.println(p2.toString());//null,0
	    p2.setName("이순신");
	    p2.setAge(20);
	    System.out.println(p2);
	    p2.setName("홍길동");
	    p2.setAge(10);
	    System.out.println(p1==p2);//false 주소가 달라서
	    
	    DEPT d1= new DEPT(10,"영업부","강남");
	    System.out.println(d1.getData());
        d1.printData();
	}

}
