
public class TestPet2 {

	public static void main(String[] args) {
		//  다형성 대쵸적인 예
		//1. 배열
		Pet[] c={
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈","검정"),
		};
      for (Pet x : c) {
		x.cry();
		if (x instanceof Cat) {
			//형변환
		}else if(x instanceof Dog) {
			
		}
	}
	}

}
