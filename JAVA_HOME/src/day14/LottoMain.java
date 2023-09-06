package day14;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1. 로또 번호 생성(수동) | 2. 로또 번호 생성(자동) |3. 당첨 번호 생성(자동) | 4. 당첨 번호 확인 (내역 포함) |5. 당첨 번호 리스트 확인 |6. 종료 (do~while)
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		LottoManager lm = new LottoManager();
		int menu = 0;
		
		do {
			System.out.println("----menu----");
			System.out.println("1. 로또 번호 생성(수동)");
			System.out.println("2. 로또 번호 생성(자동)");
			System.out.println("3. 당첨 번호 생성(자동)");
			System.out.println("4. 당첨 번호 확인 (내역 포함)");
			System.out.println("5. 당첨 번호 리스트 확인");
			System.out.println("6. 종료");
			System.out.println(" > 메뉴입력 : ");
			
			menu = scan.nextInt();
			
			switch(menu){
				case 1: 
					System.out.println("1. 로또 번호 생성(수동)");
					lm.createLotto(scan);
					break;
				case 2: 
					System.out.println("2. 로또 번호 생성(자동)");
					lm.createLottoAuto();
					break;
				case 3: 
					System.out.println("3. 당첨 번호 생성(자동)");
					lm.insertLottoAuto();
					break;
				case 4: 
					System.out.println("4. 당첨 번호 확인 (내역 포함)");
					lm.checkLotto();
					break;
				case 5: 
					System.out.println("5. 당첨 번호 리스트 확인");
					lm.printLotto();
					break;
				case 6: 
					System.out.println("6. 종료");
					break;
					default:
						System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu !=6);
		System.out.println("프로그램 종료");

		
		
		scan.close();
		
		
		
	}

}
