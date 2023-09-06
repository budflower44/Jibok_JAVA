package day09;

public class MethodEx02 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산(+ - * / %)을 처리
		MethodEx02 me = new MethodEx02();
		int a = 8;
		int b = 4;
		System.out.println(me.sum(a, b));
		System.out.println(me.mius(a, b));
		System.out.println(me.mul(a, b));
		System.out.println(me.div(a, b));
		System.out.println(me.rem(a, b));


		
	}
	
	//사칙 연산의 메서드 생성 static 없이 생성
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int mius(int num1, int num2) {
		return num1-num2;
	}
	
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	
	public double div(int num1, int num2) {
		return (double)num1/num2;
	}
	
	public int rem(int num1, int num2) {
		return num1%num2;
	}
	
	
	

}