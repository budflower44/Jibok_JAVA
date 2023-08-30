package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수 선언 + 초기화
		 * 자료형(타입) 변수명 = 값;
		 * 		 */
		
		int num = 123;  // 선언 + 초기화
		System.out.println(num);
		
		//System.out.println => sysout + ctrl+space
		System.out.println(); //줄바꿈
		
		//int num = 456; //중복선언 불가능, 빨간 밑줄
		
		num = 456;  // = 대입연산자 (왼쪽의 있는 변수에 오른쪽에 있는 값을 넣어라 / 덮어쓰기)
		System.out.println(num);
		
		int num1 = 78, num2 = 45, num3 = 89;  // 같은 자료형에서는 가능한 형태 / 노란 밑줄은 안쓴 변수, 지워도 무방 (필요없는 메모리를 잡아먹음으로)
		
		num1 = 789;
		System.out.println(num1);
		
		//8개의 기본 자료형은 선언이 될 때 지역변수로 선언됨 => 지역변수 범위 (scope) { }
		
		
		//명령어 쓸때도 기본적으로 {} 갖고 있음
		int a=0; // 변수를 원하는 {} 범위 내에서 선언 
		if(true) {
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		// char 한글자만 저장 가능 / char ch = '';
		char ch = 'a';  //"" => 문자열(String) / '' => 한글자(char)
		double dou = 3.0;
		byte b = 1;
		boolean boo = true;  // true, false로만 저장 가능
		
		//float / long 자료형은 접미사를 반드시 붙여야 인식됨
		//float(f F)  long(l L) 둘다 가능
		float f = 1.2f;
		long ㅣ = 1L; // 소문자는 1이랑 비슷하게 생겨서 대문자로 기입하는게 좋음
		
		num2 = 010; // 앞자리 0붙이면, 8진수로 인식 (0~7까지 8=>10)
		num3 = 0x10; // 16진수 인식 (0~15(10부터는 ABCDEF로 표기)까지 16=>10) / 메모리 볼때 주로 봄
		
		// 사칙연산: + - * / %(나머지)
		
		//문제: 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고,
		// 값을 입력하여, 세 점수의 합을 콘솔에 출력
		
		int kor = 23;
		int eng = 25;
		int math = 35;
		
		System.out.println(kor+eng+math);
		
		// 선생님 답변
		int sum = kor+eng+math;
		System.out.println("국어, 영어, 수학점수 합계 : "+sum); //+는 연결연산자 (정수 외의 형태가 있을 경우)
		System.out.println(kor+eng+math+"점");
		System.out.println("합계: "+kor+eng+math); // 문자 뒤로는 문자로 인식됨
		System.out.println("합계: "+(kor+eng+math)); // () 우선순위 처리 
		
		
		
	}
	// num1 = 123; (찾을 수 없는 변수)
	// int num1 = 123; // 변수 선언 가능
	
}