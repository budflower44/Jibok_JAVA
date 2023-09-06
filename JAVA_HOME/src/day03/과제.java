package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50 사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35 
		 * 입력 > 10
		 * 컴퓨터 : up~!!
		 * 입력> 20
		 * up~!!
		 * 입력 > 40
		 * down~!!
		 * 입력 > 35
		 * 정답~!!
		 * */
		
		// 1. 컴퓨터 : 랜덤수 생성하여 저장 (완료)
		// 2. 유저에게 입력할 수 받기 (완료)
		// 3. for문 무한대로 돌리면서 if 문으로 조건을 확인 >> 문구 출력
		// 4. 정답일 때 >> 문구 출력 break;
		
		int a = (int)(Math.random()*50)+1;
		System.out.println("정답은 "+a+"입니다.");
		
		System.out.println("1~50까지의 정수 중 하나를 입력하세요.");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		
		a: for(;;) {
			if(num1 > a) {
				System.out.println("Down~!!");
				num1 = scan.nextInt();
			}else if(num1 < a) {
				System.out.println("Up~!!");
				num1 = scan.nextInt();
			}else if(num1 == a) {
				System.out.println("정답입니다~!!");
			break a;
			}
		}
		
		
		
		
		scan.close();

	}

}