
public class Sample07_3operator {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int max =(a>b)?a:b;//a,b 비교 최대값 저장
		max=(max>c)? max:c;// 최대값과 c비교 최대값저장
		System.out.println(max);
		// 10, 11 항을 한줄로 만들어보기
		int max2 = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max2);
				
				
		

	}

}
