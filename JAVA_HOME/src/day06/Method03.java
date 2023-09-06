package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / % 만 허용
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산 
		 * */
		
		//1. 메서드 생성 (static 빼고)
		//2. main에서 정수 2개, 연산자 입력받기
		//3. switch문으로 case 별로 연산자 별 메서드 호출
		//4. 연산자 값 출력하기
		//5. 출력 모양 : n + n = n
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수, 연산자, 정수를 차례대로 입력해주세요.");
		int a = scan.nextInt();
		String ex = scan.next();
		int b = scan.nextInt();
		
		Method03 me3 = new Method03();
		int sum = me3.sum(a,b);
		int mi = me3.mi(a,b);
		int mul = me3.mul(a,b);
		double div = me3.div(a,b);
		int re = me3.re(a,b);
		
		switch(ex) {
			case "+" : 
				System.out.println(a+"+"+b+"="+sum);
				break;
			case "-" : 
				System.out.println(a+"-"+b+"="+mi);
				break;
			case "*" : 
				System.out.println(a+"*"+b+"="+mul);
				break;
			case "/" : 
				System.out.println(a+"/"+b+"="+div);
				break;
			case "%" : 
				System.out.println(a+"%"+b+"="+re);	
				break;
			default : 
				System.out.println("연산자를 잘못 입력하셨습니다.");
				break;
		}
		
		// 선생님 풀이
		
		System.out.println("==계산기를 만들어 보자==");
		System.out.println("연산자를 입력해주세요. > ");
		String op = scan.next();
		
		System.out.println("두 정수를 입력해주세요. ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		
		//메서드 완성
		switch(op) {
		case "+": add(op, num1, num2);
			break;
		case "-": 
			int r = sub(num1, num2);
			System.out.println(num1+op+num2+"="+r);
			break;
		case "*": mul_(op, num1, num2);
			break;
		case "/":
			double r1 = div_(num1, num2);
			System.out.println(num1+op+num2+"="+r1);
			break;
//		case "%":
//			int r2 = rem(num1, num2);
//			System.out.println(num1+op+num2+"="+r2);
//			break;
			//rem2를 호출하여 몫과 나머지를 출력
		case "%":
			rem2(num1, num2);
			// 보충
			double[] d2 = rem2_(num1, num2);
			System.out.println(d2[0]+"..."+d2[1]);
			
		
			default:
				System.out.println("잘못된 연산자 입니다.");
		}
		
		
		System.out.println("계산기 종료.~!!");
		
		scan.close();
		
	}

	public int sum(int num1, int num2) {
		return num1+num2;
	}

	public int mi(int num1, int num2) {
		return num1-num2;
	}
	
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	
	public double div(int num1, int num2) {
		return (double)num1/num2;
	}
	
	public int re(int num1, int num2) {
		return num1%num2;
	}
	
	// 선생님 풀이
	// 값을 연산자까지 매개변수로 받아 리턴없이 출력한 메서드
	public static void add(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	//두 정수를 매개변수로 받아 결과를 리턴 받는 형태의 메서드
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static void mul_(String op, int num1, int num2) { // () 순서는 상관없으나, 매개 변수 넣을때는 순서 유의해야함
		System.out.println(num1+op+num2+"="+(num1*num2));
	}
	public static double div_(int num1, int num2) {
		return (double)num1/num2;
	}
	public static int rem(int num1, int num2) {
		return num1%num2;
	}
	
	/* 기능 : 두 점수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 * */
	
	public static double[] rem2(int num1, int num2) {
		double ri[] = new double[] {(int)num1/num2, num1%num2};
		System.out.println("몫:"+ri[0]+" 나머지:"+ri[1]);
		return ri;
	}
	
	// 선생님 풀이
	public static double[] rem2_(int num1, int num2) {
		double d[] = new double[2];
		d[0] = num1/num2;
		d[1] = num2%num2;
		return d;
	}
	
	
	

	
}