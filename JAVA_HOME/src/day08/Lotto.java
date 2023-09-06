package day08;

import java.util.Scanner;

public class Lotto {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 로또번호 생성 (1~45 랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 => 사용자번호
		 * 당첨번호 => 1~45까지 7개 => 보너스번호
		 * 
		 * 로또번호 (6자리)    1 2 3 4 5 6  // 중복자리 x
		 * 당첨번호 (6자리+1자리) 1 2 3 4 5 6 [7]  // 중복자리 x
		 * 로또번호는 중복되면 안됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스 번호
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝~!!
		 * */
		
		// 1. 배열 생성
		
		System.out.println("--로또 당첨 번호--");
		int loto[] = new int[7];
		loto = loto(7);
		System.out.println();

		System.out.println("--내 당첨 번호--");
		int user[] = new int[6];
		user = loto(6);
		check(loto, user);

		
		
	}
	
	//1. 랜덤 배열 생성
	public static int[] loto(int arr1) {
		int arr[] = new int[arr1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {   // 11 0 0 0 0 0
					i--;
					break;
				}
			}	
		}
		if(arr.length ==7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");			
		}
			System.out.print("["+arr[arr.length-1]+"]");
			System.out.println();
		}else {
			for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
		return arr;
	}
	
//	public static void print(int arr2[]) {
//		for(int i=0; i<arr2.length-1; i++) {
//		}
//	}	
//	
//	
//	
//	public static int[] user(int arr1) {
//		int arr[] = new int[arr1];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*45+1);
//			for(int j=0; j<i; j++) {
//				if(arr[i]==arr[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.print(arr[i]+" ");
//		}
//		return arr;
//	}
//	
	
	//2. 등수 체크 일치
	
	public static void check(int arr[], int arr1[]) {
		int boo = 0;
		int bo = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i]==arr[j]) {
					boo += 1;
				}
				if(arr1[i]==arr[6]) {
					bo = 1;
				}
			}
		}
		if(boo==6 && bo==0) {
			System.out.println();
			System.out.println("1등 당첨");
		}
		if(boo==5 && bo==1) {
			System.out.println();
			System.out.println("2등 당첨");
		}
		if(boo==5 && bo==0) {
			System.out.println();
			System.out.println("3등 당첨");
		}
		if(boo==4 && bo==0) {
			System.out.println();
			System.out.println("4등 당첨");
		}
		if(boo==3 && bo==0) {
			System.out.println();
			System.out.println("5등 당첨");
		}if(boo==2 && bo==0) {
			System.out.println();
			System.out.println("꽝~!!");
		}if(boo==1 && bo==0) {
			System.out.println();
			System.out.println("꽝~!!");
		}if(boo==0 && bo==0) {
			System.out.println();
			System.out.println("꽝~!!");
		}if(boo==6 && bo==1) {
			System.out.println();
			System.out.println("꽝~!!");			
		}if(boo==4 && bo==1) {
			System.out.println();
			System.out.println("꽝~!!");			
		}if(boo==3 && bo==1) {
			System.out.println();
			System.out.println("꽝~!!");			
		}
	}
	
}