package javaWorkshop03;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
for (int i = arr.length-1; i >=0; i--) {
	System.out.println(arr[i]+"");
}
System.out.println("===============================================");
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[arr.length-1-i]+"");
}

	}

}
