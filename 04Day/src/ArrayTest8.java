
public class ArrayTest8 {

	public static void main(String[] args) {
		
		//2차원 배열
		//1. 정방형(모든행의 열크기동일)

		//가. 배열 선언
		int[][]num;
		
		
		//나. 배열생성
		num= new int[2][3];//2행 3열
		
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		
		System.out.println (num[0]);//0의 주소
		
	    System.out.println(num [0][0]);
	    System.out.println(num [0][1]);
	    System.out.println(num [0][2]);
	    System.out.println(num [1][0]);
	    System.out.println(num [1][1]);
	    System.out.println(num [1][2]);
	 //   System.out.println(num[1][3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	//   at ArrayTest8.main(ArrayTest8.java:31)
		
	    System.out.println(num.length);// 2
	    System.out.println(num[0].length);//3
	    System.out.println(num[1].length);//3
	    
	    for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"]="+num[i][j]);
			}
		}
		System.out.println("===================================");
		
	System.out.println("===========================");
	for (int[] i : num) {
		for (int j : i) {
			System.out.println(">>>>>>"+j);
		}
	}
     
	System.out.println("행의 갯수"+num.length);
	System.out.println("행의 갯수"+num[0].length);
	System.out.println("행의 갯수"+num[1].length);
	
	
	
	}

}
