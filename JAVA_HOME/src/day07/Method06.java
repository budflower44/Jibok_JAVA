package day07;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력
		 * */
		
		//1. 정수 입력 받기
		//2. 메서드 호출하여 구구단 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--구구단의 단을 정수로 입력해주세요.");
		int goo1 = scan.nextInt();
		goo(goo1);
		
		//2~9까지 반복하여 모든 단을 출력
		
		//1. 2~9까지 반복하여 값 도출하기
		//2. 메서드 호출하여 구구단 출력하기
		
		System.out.println();
		System.out.println("--2~9까지의 구구단--");
		for(int i=2; i<=9; i++) {
			goo(i);
		}
		
		scan.close();
	}
	
	/* 기능 : 단어 주어지면 그 단의 구구단을 출력(리턴 x)
	 * 2*2=4
	 * 2*3=6
	 * ...
	 * 2*9=18
	 * */
	
	/* 리턴타입 : 리턴 x / 정수로 입력받고 문자로 출력할 것
	 * 매개변수 : int num
	 * 메서드명 : goo
	 * */
	
	public static void goo(int num) {
			for(int j=1; j<=9; j++) {
				System.out.println(num+"*"+j+"="+(num*j));
			}
			System.out.println();
	}
	
}