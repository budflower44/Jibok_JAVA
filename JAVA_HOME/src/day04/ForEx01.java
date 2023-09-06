package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13, 17...
		 * 
		 * */

		/* num를 입력받아서 nun가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 * */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int a = 0;
//		int f = 0;
//		System.out.println("값을 입력하세요.");
//		a = scan.nextInt();
//
//		for(int i = 1; ;i++) {
//			if(a%i==0) {
//				f = i; 
//					break;
//			}
//		}
//		
//		if(f==a) {
//			System.out.println("소수입니다.");
//			}if(f==1) {
//				System.out.println("소수입니다.");
//				}else if(f!=1) {
//					System.out.println("소수가 아닙니다.");
//				}
//			
//		// 선생님 답변
//		// 입력받은 수의 약수가 몇개인지 확인
//
//		// Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int num = scan.nextInt();
//		int count = 0;
//		
//		for(int i = 1; i<=num; i++) {
//			if(num%i==0) {
//				//System.out.print(i+" ");
//				//약수의 개수
//				count = count+1; // count++;
//			}
//		}
//		System.out.println(count);
//		
//		if(count == 2) {
//			System.out.println("소수입니다.");
//		}else {
//			System.out.println("소수가 아닙니다.");
//		}
		
		/* 2~100까지 중 소수를 출력 == int i*/
		/* 약수 값은 1부터 ~ i까지 돌려서 약수를 구해야 함 */
		
		
		int num1 = 0;
		int co = 0;
		int i = 0;
		
//		for(i = 1; i<=num1; i++) { // 2만 나옴..
//			if(num1%i==0) {
//				co = co+1;
//				}
//			if(co==2) {
//				System.out.println(i);
//			}
//		}
		
		for(i = 2; i<=100; i++) {              // 2~100까지 범위의 for문
			co=0;                              // 반복문 위치에 따라서 값 저장 초기화됨
			for(int d = 1; d<=i; d++) {			// 약수 구하기 위한 for 문
				if(i%d==0) {
					co = co+1;
				}
			}
			if(co == 2) {
				System.out.println(i);
			}
		}
		
		// 선생님 답변
		
		int count_= 0;
		for(int i_ = 2; i_<=100; i_++) {  // num 2~100까지
			count_=0; //각 num마다 약수의 개수 = 0부터 시작
			for(int j=1; j<=i_; j++) {  // 약수를 구하기 위해 돌리는 값
				if(i_%j==0) { // 약수 체크
					count_++;
				}
			}
			//약수가 2개인지 체크
			if(count_ ==2) {
				System.out.print(i_+" ");
			}
		}
		
		
		
	
	
//		scan.close();
		
		
	}

}