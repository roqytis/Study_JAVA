package student;

public class TestStudent {

	public static void main(String[] args) {
		Student stu1 = new Student("Kim",100,80,95,89);
		Student stu2 = new Student("Lee",60,70,99,98);
		Student stu3 = new Student("Park",68, 86, 60,40);
	
		
		Student[] ss= new Student[3];
		ss[0]=stu1;
		ss[1]=stu2;
		ss[2]=stu3;
	
	System.out.println(stu1.getName()+"평균:"
			+stu1.getAvg()+"학점: "+stu1.getGrade());
	
	System.out.printf("%s 평균: %.2f 학점: %s",
			stu2.getName(),stu2.getAvg(),stu2.getGrade()+"\n");
	
	System.out.printf("%s 평균: %.2f 학점: %s",
			stu3.getName(),stu3.getAvg(),stu3.getGrade());
	
	}

}
