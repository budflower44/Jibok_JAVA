package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5명의 정수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와, 평균을 출력
		 * 최고점수
		 * */
		
		// 1. 정수 입력받기
		// 2. 5명 배열 참조 변수 만들기
		// 3. 점수의 합계 구하기
		// 4. 점수의 평균 구하기
		// 5. 최고점수 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int[] five = new int[5];
		
		System.out.println("5명의 점수를 차례대로 입력하세요 (0~100 범위)");
		five[0] = scan.nextInt();
		five[1] = scan.nextInt();
		five[2] = scan.nextInt();
		five[3] = scan.nextInt();
		five[4] = scan.nextInt();
		int sum = 0;
		int avg = 0;
		int max = 0;
		
		
		for(int i=0; i<five.length; i++) {
			sum = sum+five[i];
		}
		System.out.println("5명의 합계는 "+sum+"점 입니다.");
		for(int i=0; i<five.length; i++) {
			avg = sum/five.length;
		}
		System.out.println("5명의 평균은 "+avg+"점 입니다.");		
		for(int i=0; i<five.length; i++) {
			if(max<five [i]) {
				max = five [i];
			}
		}
		System.out.println("5명 중 최고점은 "+max+"점 입니다.");	

				
		scan.close();
	}

}