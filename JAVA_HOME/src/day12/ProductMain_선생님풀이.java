package day12;

import java.util.Scanner;

public class ProductMain_선생님풀이 {

	public static void main(String[] args) {
		/* 반복적으로 메뉴를 등록 프로그램
		 * */
		Product_선생님풀이[] p = new Product_선생님풀이[10];
		Scanner scan = new Scanner(System.in);
		
		char menu = 'y';
		int cnt = 0; //while에서 index를 핸들링 하기 위한 변수
		
		// 빠져나갈 수 있는 조건을 세팅하는 것이 좋음. 
		while(menu != 'n') {
			System.out.println("상품등록(y/n) >>");
			menu = scan.next().charAt(0);
			
			if(menu == 'y') {
				//반복 입력
				System.out.println("상품명 >");
				String name = scan.next();
				
				System.out.println("가격 >");
				int price = scan.nextInt();
				
				//객체를 생성해서, 메뉴와 가격을 등록 => 배열 cnt 번지에 추가
				//생성자 이용하는 방법
				//Product_선생님풀이 tmp = new Product_선생님풀이(name, price);
				//p[cnt] = tmp;
				//-> 동일함 p[cnt] = new Product_선생님풀이(name, price);
				
				//메서드 이용
				p[cnt] = new Product_선생님풀이();
				p[cnt].insertProduct_선생님풀이(name, price);
				cnt++;
			}else {
				//menu == 'n'
				if(menu == 'n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("y/n만 가능합니다.");
				}
			}
		}
		
		System.out.println("--등록된 상품 리스트--");
		//진행된 번지 확인 중요
		for(int i=0; i<cnt; i++) {
			//toString
			System.out.println((i+1)+". "+p[i]);
			
			//출력 메서드를 사용한 경우
			System.out.print((i+1));
//			p[i].메서드 호출;
		}
		
		
		
		
		
		scan.close();

	}

}
