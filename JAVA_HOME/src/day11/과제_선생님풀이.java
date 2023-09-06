package day11;

import java.util.Scanner;

import day06.Method01;

public class 과제_선생님풀이 {

	public static void main(String[] args) {
		//EzenComputer의 객체 생성 후 출력
		System.out.println(EzenComputer_선생님풀이.company); // new 없어도 company는 static으로 호출 가능함
		Method01.mul(0, 0);
		EzenComputer_선생님풀이 ez = new EzenComputer_선생님풀이("홍길동", "010-1111-1111", "인천");
		ez.printInfo();
		ez.printCompany();
		ez.insertCourse("java", "8/16~3/14");
		ez.insertCourse("DB", "1개월");
		ez.printCourse();
		
		System.out.println("-------------------");
		EzenComputer_선생님풀이 ez1 = new EzenComputer_선생님풀이("김영이", "990101", 24, "1111", "서울");
		ez1.printInfo();
		ez1.insertCourse("java", "8/16~3/14");
		ez1.insertCourse("html", "2개월");
		ez.printCourse();
		
		/* 학생클래스를 담을 수 있는 배열을 생성 후 
		 * 5명의 학생을 등록
		 * 
		 * */
//		String student[] = new String[5];
//		for(int i = 0; i<student.length; i++) {
//			EzenComputer_선생님풀이 tmp = student[i];
//		}
		//선생님풀이
		EzenComputer_선생님풀이 [] std = new EzenComputer_선생님풀이[7];
		std[0]=new EzenComputer_선생님풀이("영이", "980101", 25, "2222", "인천");
		std[1]=new EzenComputer_선생님풀이("순이", "980201", 25, "3333", "서울");
		std[2]=new EzenComputer_선생님풀이("철이", "980301", 25, "4444", "인천");
		std[3]=new EzenComputer_선생님풀이("철수", "980401", 25, "5555", "서울");
		std[4]=new EzenComputer_선생님풀이("영철", "980501", 25, "6666", "서울");
		std[5]=ez;
		std[6]=ez1;
		std[0].insertCourse("DB", "1개월");
		std[1].insertCourse("html", "2개월");
		std[1].insertCourse("java", "6개월");
		
		//과제
		/* 학생 이름으로 검색 => 모든 정보 출력
		 * 지점 정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력 (인천지점 몇명, 서울지점 몇명)
		 * 
		 * */
		int cnt = 0;
		String searchName = "홍길동";
		System.out.println(searchName+"님의 정보--------");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
				cnt++;
			}
//			else {	
//				System.out.println("검색 이름이 없습니다."); //else 쓰면일치할때까지 반복해서 NOT 구문이 출력됨
//			}				
			}
		if(cnt==0) {
			System.out.println("검색 이름이 없습니다.");
		}
		
		System.out.println("---------------------");
		String searchBranch = "인천";
		System.out.println(searchBranch+" 지점의 학생 정보 출력--------");
		//향상된 for문은 완성된 배열에서만 사용가능 set은 불가능 (완성된걸 사용할 때만 가능) -> set을 할 순 있으나 실제 배열에 반영안됨
		for(EzenComputer_선생님풀이 ezz : std) {
			if(ezz.getBranch().equals(searchBranch)) {
				ezz.printInfo();
			}
		}
		System.out.println("---------------------");
		String searchCourse = "java";
		System.out.println(searchCourse+"과목의의 학생 정보 출력--------");
		// 값이 비어있는 배열에서 Null 값이 있을 경우 equals 명령어가 error
		for(EzenComputer_선생님풀이 e : std) {
			for(int i=0; i<e.getCnt(); i++) {
				if(e.getCourse()[i].equals(searchCourse)) {
//				if(searchCourse.equals(e.getCourse()[i])) // 이렇게 써도 가능
					e.printInfo();
					e.printCourse();
					System.out.println("-----------");
				}
			}
		}
		
		
		
	}
}