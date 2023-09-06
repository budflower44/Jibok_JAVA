package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6 의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
		
		// 6/1=0, 6/2=0, 6/3=0, 6/4=3, 6/5=2, 6/6=0
		int num = 6;
		for(int i = 1; i<=6; i++) {
			if(num%i==0) {
				System.out.print(i);
			}
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");
		
		//선생님 풀이
		// 6/1=0, 6/2=0, 6/3=0, 6/4=3, 6/5=2, 6/6=0
		//1부터 num_ 까지 1씩증가
		int num_ = 12;
		for(int i = 1; i<=num; i++) {
			if(num_ % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");
		
		//num 입력받아서 그 수의 약수를 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수의 약수를 구할려고 합니다. 임의의 정수를 입력해주세요.");
		
		int num4 = scan.nextInt();
		for(int i = 1; i<=num4; i++) {
			if(num4 % i ==0) {
				System.out.print(i+" ");
			}
		}
		
		//선생님 풀이
//		Scanner scan = new(System.in);
		System.out.println("숫자를 입력");
		int num2_ = scan.nextInt();
		
		
		
		
		
		scan.close();
	}

}