package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		/* 1. 상품 등록 (Scanner)
		 * 2. 상품리스트(배열) 출력
		 * 3. 상품 등록 y/n (while)
		 * 3-1. 배열에 등록
		 * 4. n => 등록된 제품 리스트 출력
		 * */
		//Product class 확인용
		Scanner scan = new Scanner(System.in);
		
		
//		System.out.println(p.toString());
		//배열 생성
		Product add[] = new Product[10];
		
		//상품 등록
		int cnt = 0;
		String tmp = null;
		
		for(int i=0; i<10; i++) {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			tmp = scan.next();
				if(tmp.equals("y")) {
					Product p = new Product();
					p.menuAdd();
					add[i] = p;
					cnt++;
				}else if(tmp.equals("n")) {
					for(int j=0; j<cnt; j++) {
					add[j].printMenu();					
					}
				break;
			}
		}
	}
		
}
