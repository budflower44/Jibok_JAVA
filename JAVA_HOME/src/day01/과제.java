package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용하여 
		 * 평균이 80이상이면 결과: 합격, 아니면 결과 : 불합격 출력
		 */
		int kor, eng, math;
		kor = 78;
		eng = 98;
		math = 77;
		int sum = kor+eng+math;
		double avg = (sum/3);
		System.out.println("합계 : "+(sum));
		System.out.println("평균 : "+(avg));
		System.out.println((avg>=80)? "합격":"불합격");
		
		// 선생님 답변
		int kor_ = 78;
		int eng_ = 45;
		int math_ = 23;
		// 지역변수는 반드시 초기화를 (초기값/초기 설정?) 해야한다. // A: 초기화를 하지 않으면 쓰레기 값이 저장된다.
		int sum_;
		sum_= 0;
		double avg_ = 0;
		sum = kor_+eng_+math_;
		avg = sum / 3.0; // 자료형 변환 or .0 해도 상관없음
		System.out.println("합계: "+sum_+", 평균: "+avg);
		System.out.println("결과: "+(avg_>=80 ? "합격":"불합격"));
		
		
	}

}