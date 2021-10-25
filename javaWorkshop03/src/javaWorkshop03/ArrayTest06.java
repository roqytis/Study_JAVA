package javaWorkshop03;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	
		System.out.println("키의 최댓값을 구합니다.");		
		System.out.print("사람 수: ");	
		int num= scan.nextInt();
			
		int[] height= new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("사람"+(i+1)+": ");
		height[1]=scan.nextInt();
		}
		int max=height[0];
		for (int i1 = 1; i1 < height.length; i1++) {
			if (height[i1]> max) {
				max=height[i1];
			}
		System.out.println("최댓값은"+max+"입니다.");
		}
		
		
		
		}
	}


