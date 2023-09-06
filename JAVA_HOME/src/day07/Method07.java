package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex) 3, * => ***
		 * 5, o => ooooo
		 * 7, ☆ => ☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드 호출 => 출력
		 * */
		
		//1. 숫자와 기호 입력받기
		//2. 메서드 호출하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--숫자 입력--");
		int a = scan.nextInt();
		System.out.println("--기호 입력--");
		String b = scan.next();
		print(a,b);
		
		scan.close();
	}

	 /* 리턴타입 : 리턴x
	 * 매개변수 : int num, String gi 
	 * 메서드명 : print
	 * */
	
	//1. 
	public static void print(int num, String gi) {
		for(int i=0;i<=num-1;i++) {
			System.out.print(gi);
		}
	}
	
	
	
	
	
}