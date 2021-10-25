package javaWorkshop03;

public class ArrayTest09 {

	public static void main(String[] args) {
		
		int[] arr3 = new int[5];
		int randNum= 0;
		int sum =0;
		
		top:
			for (int i = 0; i < 5; i++) {
				randNum=(int)(Math.random()*10+1);//1~10의 난수
						for (int j = 0; j < i; j++) {
					if(randNum==arr3[j]) {}
					continue top;
						}
			}
//		arr3[i]=randNum; 
//						
//	}
//  
//	for (int i : arr3) {
//		
	}
	
}
