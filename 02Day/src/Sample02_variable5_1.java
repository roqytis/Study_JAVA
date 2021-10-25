
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		//자바는 블럭 scope(자바스크립트는 함수 scope)
		{ //A블럭
			int num=10; 
			//A불록 안에서 선언, 선언 블럭 안에서 사용(이런걸 보고 블럭 스코프 라함)
	        System.out.println("A block====="+num);
	
		} //A 블럭 종료
	      //System.out.println("블럭 밖 ===="+num); // 블럭밖에서 인식불가 	
	
	
		{//B블럭
			int num=20;
		    System.out.println("B Lock======"+num);
		    { //int num2=1;
		    	System.out.println("C Lock===="+num);//B블럭 안에 블럭 추가 C}
		    }
		}
	
	
	
	}// 메인 블럭 끝

}
