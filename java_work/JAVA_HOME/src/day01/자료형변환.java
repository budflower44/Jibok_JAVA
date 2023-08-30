package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자료형 변환 : casting
		 * 자료형(변수의 타입)
		 * a = b : a의 자료형과 b의 자료형이 맞지 않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황
		 * 크기가 큰 자료형에 크기가 작은 자료형을 넣는 케이스 / 크기가 큰 자료형 = 크기가 작은 자료형
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입)
		 *  */
		
		byte num = 10;
		int num1 = num;  // int = byte (자동 형변환 가능)
		
		double num2 = 10.2; 
		
		// num1 = num2; : 오류 / int = double (명시적 형변환)
		num1 = (int)num2; // num2에서 int 형만 취해서 가져가겠다.
		System.out.println(num1);
		
		int num3 = (int)1.2; // 소수점은 날아감
		System.out.println(num3);
		
		/* 문제 : 국어, 영어, 수학 세값의 합계와 평균을 출력 (평균 소수점 살려서)
		 * */
		
		double kor = 24.34;
		int eng = 12;
		int math = 98;
		System.out.println("3과목 평균 : "+((kor+(double)eng+(double)math)/3));
		System.out.println("3과목 합계 : "+(kor+(double)eng+(double)math));
		
		// 선생님 답변
		int kor_, eng_, math_;
		kor_ = 77;
		eng_ = 78;
		math_ = 89;
		int sum = kor_+eng_+math_;
		double avg = sum / 3;
		//자료형이 double이고, 나누는 값이 0이면 => Infinity (Q: 에러값인 것 같은데 정의가 있는지 찾아볼 것)
		//자료형이 int 이고, 나누는 값이 0이면 => 예외발생(Exception)
		System.out.println("합계:"+sum+", 평균: "+avg);
		
		double avg_ = (double)sum / 3;
		System.out.println("합계:"+sum+", 평균: "+avg_);
		
	}

}