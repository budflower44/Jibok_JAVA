package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 구구단 -단을 입력받아서 입력받은 단을 출력
		 * ex) 2 =>
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 * */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("단을 입력해주세요. (구구단 출력)");
		int num = scan.nextInt();
		for(int i = 1; i<=9; i++) {
			sum = num*i;
			System.out.println(num+"*"+i+" = "+sum);
		}
		
		//선생님 풀이
//		Scanner scan = new Scanner(System.in);
		System.out.println("num를 입력해주세요.");
		int num_ = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num_*i));
		}
		
		scan.close();
		
	}

}