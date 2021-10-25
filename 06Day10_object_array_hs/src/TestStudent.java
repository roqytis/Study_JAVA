
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("홍길동1","서울1");
		Student stu2 = new Student("홍길동2","서울3");
		Student stu3 = new Student("홍길동3","서울4");
		Student stu4 = new Student("홍길동4","서울5");
		Student stu5 = new Student("홍길동5",19,"서울5");
        //객체를 담을 배열 선언, 생성
		Student[] yy= new Student[5];
		System.out.println(yy[0]);
		yy[0]= stu1;
		yy[1]= stu2;
		yy[2]= stu3;
		yy[3]= stu4;
		yy[4]= stu5;
	   int sum=0;
		for (int i = 0; i < yy.length; i++) {
		 //   Student tt=yy[i];
		  sum=sum+yy[i].getAge();  
		   
		    //System.out.println(tt);
	    	//System.out.println(yy[i]);
		  //  System.out.println(tt.getName());
	    	    }
		
		System.out.println(sum);
	
		
		
		
		
		System.out.println("====================================");
		Student[] yy2= {new Student("홍길동1","서울1"),
				new Student("홍길동2","서울3"),
				new Student("홍길동4","서울4"),
				new Student("홍길동5","서울5"),
				new Student("홍길동5",19,"서울5")};

       for (Student x : yy2) {
		System.out.println(x.toString());
	}
	
	}
				
}
		
		
	


