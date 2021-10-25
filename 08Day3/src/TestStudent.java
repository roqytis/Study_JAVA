import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		
		Date d= new Date();
	    System.out.println(d);
	    System.out.println(d.toString());
	    
	    //////////////////////////////////////
	    Integer i = new Integer(100);
	    System.out.println(i);//i.toString() // 문자열 100
	    System.out.println(i.toString());//100
	
	    Student s= new Student("홍길동",20,"서울");
	    
	
	}

}
