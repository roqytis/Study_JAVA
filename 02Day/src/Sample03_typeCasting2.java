
public class Sample03_typeCasting2 {

	public static void main(String[] args) {

		
		//데이터 타입 변경(명시적으로 형변환 시킨다)

		int n =10;
		short n2=(short)n;
		
		short x =10;
		short x2=20;
		short x3=(short)(x + x2); //주의
		//short x4=(short) x +x2; x는 쇼트고 x2는 int 라서 에러
		System.out.println(n2);
	}

}
