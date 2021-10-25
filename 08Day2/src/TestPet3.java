
public class TestPet3 {

	public static void main(String[] args) {
		
		Object [] c= {
				10,//오토박싱-> new Integer(10)자동으로 변환 하려 배열에 넣음
				"홍길동",
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈","검정"),
		};
      Object x = 10;
      x="홍길동";
      x="3.123";
   	  x=true;
   	  x= new Cat("야옹이", 3, "암놈");
	  x=10;
   	  //다형성 대표적인 예
   	  //2. 메서드의 파라미터 변수
   	  // Equals()==>값 비교
	System.out.println("10".equals("10"));
	System.out.println(x.equals(x));
	Cat x2= new Cat("야옹이", 3, "암놈");
	System.out.println(x==x2);
	
	}

}
