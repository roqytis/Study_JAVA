
public class Sample06_circle_operator_2 {

	public static void main(String[] args) {
	
		String name=null;
		//System.out.println((4<2)||(name.length()==4));// 뒤에 조건검사 o
		System.out.println((4>2)||(name.length()==4));//뒤에 조건검사 x
	}

}
