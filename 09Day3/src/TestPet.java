
public class TestPet {

	public static void main(String[] args) {
		
		//다형성
		Pet c= new Cat("나비", 3,"암컷");
		System.out.println(c);
        c.cry();
        c.eat();
		c.sleep();
		//Cat의 젠더만 출력
	    Cat cc=(Cat)c;
	    System.out.println(cc.getGender());
		
		Pet d = new Dog("하루", 2, "블랙");
		System.out.println(d);
		d.cry();
		d.eat();
		d.sleep();
        //Dog의 컬러만 출력
		Dog dd=(Dog)d;
	    System.out.println(dd.getColor());

	   //pet의 배열에 c,d 저장
//	   Pet p[]=new Pet[2];
//	   p[0]=c;//Cat
//	   p[1]=d;//Dog
	    Pet p[]=new Pet[] {c,d};
	    //foreach 문 사용 toString 호출 모든 데이터 출력
      for (Pet y : p) {
		System.out.println(y);
	    }
	    for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].toString());
		}
	    
	    
	    
	
	}

}
