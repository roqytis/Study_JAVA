package javaWorkshop03;

public class ArrayTest03 {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},{10,10,10,10,10},
				{20,20,20,20,20},{30,30,30,30,30}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum+=arr2[i][j];
				count++;//데이터 갯수 저장
							}
						}
		System.out.println("total ="+sum);
        System.out.println("averge="+ ((double) sum/count));
	}

}
