package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 최대공약수 찾기
		 * 약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수 : 두 정수의 공통된 약수
		 * 최대공약수 : 공약수 중 가장 큰값
		 * 8 : 1 2 4 8  => num1 % i == 0
		 * 12 : 1 2 3 4 6 12  => num2 % i == 0
		 * 공약수 : 1 2 4 => 4
		 * */
		
		// 문제 : 두 정수 num1, num2를 입력받아 최대 공약수를 출력
		// for문, 조건 찾기, 최대값 도출
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대공약수를 찾을 두 정수를 차례대로 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int a = 0;
		
		for(int i = 1; i<=num2; i++) {
			if((num2%i==0) && (num1%i==0)) {
				a = i;  // i값에 맨마지막 (공약)수가 입력되기 때문에 최대 공약수가 입력되는 것임.
			}
		}
		
		System.out.println(num1+"와 "+num2+"의 "+"최대공약수는 "+a+"입니다.");
		
		//선생님 풀이
		System.out.println("두 정수를 입력해주세요.");
		int num1_ = scan.nextInt();
		int num2_ = scan.nextInt();
		
		int gcd = 0;
		for(int i=1; i<=num1_; i++) {
			if(num1_ % i == 0 && num2_ % i == 0) {
				// i => 공약수
				gcd = i;	
				}
			}
		System.out.println(gcd);
		

		
		/* break는 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * break; 
		 * 중첩 for문일경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
		 * for문에 내가 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음.
		 * */
		for(int i=num1_; ; i--) {
			if(num1_ % 1 == 0 && num2_ % i == 0) {
				System.out.println("두 수의 최대공약수: "+i);
				break;
			}
		}
		
		scan.close();	
	
		int g=0;
		a: for(;;) {
			for(;;) {
				for(;;) {
					g++;
					if(g == 10) {
						System.out.println(g+"벗어나기..");
						break a;
					}
				}
			}
		}
		
		
		

		
		
	}

}