package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력 (숫자, 문자 상관없음.)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위 => 결과 무승부입니다. 
		 * */
		
		//1. 컴퓨터 > 0,1,2 중에 랜덤으로 입력
		//2. 나 > 가위, 바위, 보 중 선택해서 입력
		//3. switch문 사용해서 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("컴퓨터와 함께하는 가위, 바위, 보 게임입니다.");
		System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
		int computer = (int)(Math.random()*3);
		String user = scan.next();
		
		
		switch(user) {
			case "가위":
				if(computer==0) {
					System.out.println("컴퓨터 : 가위, 유저 : 가위, 결과 : 비겼습니다.");
				}
				if(computer==1) {
					System.out.println("컴퓨터 : 바위, 유저 : 가위, 결과 : 졌습니다.");
				}
				if(computer==2) {
					System.out.println("컴퓨터 : 보, 유저 : 가위, 결과 : 이겼습니다.");
				}
				break;
			case "바위":
				if(computer==0) {
					System.out.println("컴퓨터 : 가위, 유저 : 바위, 결과 : 이겼습니다.");
				}
				if(computer==1) {
					System.out.println("컴퓨터 : 바위, 유저 : 바위, 결과 : 비겼습니다.");
				}
				if(computer==2) {
					System.out.println("컴퓨터 : 보, 유저 : 바위, 결과 : 졌습니다.");
				}
				break;
			case "보":
				if(computer==0) {
					System.out.println("컴퓨터 : 가위, 유저 : 보, 결과 : 졌습니다.");
				}
				if(computer==1) {
					System.out.println("컴퓨터 : 바위, 유저 : 보, 결과 : 이겼습니다.");
				}
				if(computer==2) {
					System.out.println("컴퓨터 : 보, 유저 : 보, 결과 : 비겼습니다.");
				}
				break;
				default:
					System.out.println("잘못 입력하셨습니다.");
		}

		
		scan.close();
	
	}

}