
public class Sample02_Variable2 {

	public static void main(String[] args) {
		
		// 홍길동 20 서울 성별(남) 결혼여부 (false)키(185.63)wpwnd(78.25)
		// 1. 변수선언과 동시에 초기화
		String name ="홍길동";
		int age =20;
		String address="서울";
        char gender= '남';
        boolean isMarried= false;
        float height = 185.63F;
        double weight = 78.25;
		
	
//	  System.out.printf("이름은 %s, 나이는 %d, 주소는 %s 입니다.", name, age, address );
	// 위에 printf는 안되는거 맞음
        //  System.out.println();
	  //이름은 홍길동, 나이는 20, 주소는 서울
//	  System.out.println("1"+2+3); //123
//	  System.out.println(1+2+"3"); //33
//	  System.out.println(1+"2"+3+4); //1234
//	  System.out.println("이름은 "+ name); //이름은 홍길동
        // 문자열과 숫자로 조합하면 숫자가 ""없이도 문자열로 바뀜	 
	  
	  System.out.println("이름은 "+name+", 나이는 " +age+", 주소는 "+ address+"입니다.");
	  // 출력명 문자열 만들기 + 사용
	  
	//문제  문제 println사용 출력 결과 +연사자 사용
	// 홍길동 20 서울 성별 (남) 결혼여부 (false) 키 (185.63) 체중(78.25)

	   System.out.println("1 \t 2\t 3 \t 4");
	   System.out.println("ab\"cd\"");
	}

}
