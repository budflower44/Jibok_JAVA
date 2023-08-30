package day02;
import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 수를 입력받아서 2의 배수가 맞으면 2의배수입니다.
		 * 3의 배수가 맞으면 3의배수입니다.
		 * import 단축키 : ctrl + shift + o
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = scan.nextInt();
		
		if(num% 2 == 0) {
			System.out.println(num+"은 2의 배수입니다.");
		}else if(num% 3 ==0) {
			System.out.println(num+"은 3의 배수입니다.");
		}else {
			System.out.println("2의 배수도, 3의 배수도 아닙니다.");
		}
		
		// 선생님 풀이
		System.out.println("정수를 입력해주세요.");
		
		int num_ = scan.nextInt();
		
		if(num_ %2==0 && num_ %3==0) {
			System.out.println(num+"는 2와 3의 배수입니다.");
		}else if(num_ % 2==0) {
			System.out.println(num_+"는 2의 배수입니다.");
		}else if(num_ % 3 == 0) {
			System.out.println(num_+"는 3의 배수입니다.");
		}else {
			System.out.println(num_+"는 2/3의 배수가 아닙니다.");
		}
		
		
		
		
		
		scan.close();
	}

}