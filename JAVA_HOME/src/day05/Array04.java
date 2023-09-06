package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1 // 나누어서 배열에 저장
		 * ex) 19547 => 74591 => 7+4+5+9+1
		 * 	   01234 => 43210  
		 * */

		//1. 5자리의 숫자를 입력받기
		//2. 배열 거꾸로 정렬하기
		//3. 순서대로 출력하기
		//4. 각자리의 합계를 출력하기
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		// 5자리 숫자 입력 받기
		System.out.println("5자리의 정수를 입력해주세요.");
		int a = scan.nextInt();
		// 5자리 숫자 배열에 넣기
		int arr [] = new int [5];
		arr[0] = a/10000;
		arr[1] = (a%10000)/1000;
		arr[2] = (a%1000)/100;
		arr[3] = (a%100)/10;
		arr[4] = (a%10)/1;
		
		// 거꾸로 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[4-i]);	
			//각 자리의 합계 출력시키기
			sum += arr[i];
		}
		System.out.println();
		System.out.print("합계는 "+sum);
		
		scan.close();
		
		//선생님 풀이 - String
		System.out.println("5자리 숫자를 입력해주세요.");
		int num = scan.nextInt();  //11456
		int arr_[] = new int[5];
		
		// 나누기(/), 나머지(%)
		// 12345 => %10 => 5 => 배열에 저장
		// 값을 나눈 몫만 다시 나눌값으로 지정
		// 12345 / 10 => 정수만 저장
		//1234 => %10 => 4 => 배열에 저장
		//123 => %10 => 3 => 배열에 저장...
		int sum_=0;
		int i_=0;
		
		while(num > 0) {  // 입력받은 num가 0보다 작아지면 false
			int b = num % 10;  // 마지막 자리를 나머지로 받기
			arr_[i_] = b;
			sum_ += b;
			num = num / 10;  //몫 저장 => 정수 / 정수 = 정수
			System.out.println(arr[i_]);
			i_++;
		}
		System.out.println("sum: "+sum_);
		
		
		
		
		
//		Strnig s = "12345";
//		Strnig s1[] = new Strnig[5];
//		
//		s = s.split("");  // 특정 문자를 기준으로 나누기
//		int sum = 0;
//		for(int)
		
		
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = scan.nextInt();  // 5자리 숫자를 각 배열에 넣었어야 하는데, 그걸 인지 못함
//			num = arr[i];
//		}
//		System.out.print(num);
//			// 배열 거꾸로 하기
//			// 앞뒤 교환만 하면 되나?
//			System.out.println();
//			for(int j=0; j<arr.length; j++) {
//				if(i<=(5-j)) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		//선생님 풀이
		//Scanner scan = new Scanner(System.in);
//		System.out.println("5자리 숫자를 입력해주세요.");
//		int num = scan.nextInt();  //11456
//		int arr[] = new int[5];
//		
		

		
		
		
		
		
	}

}