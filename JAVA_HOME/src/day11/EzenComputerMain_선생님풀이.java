package day11;

import java.util.Scanner;

public class EzenComputerMain_선생님풀이 {

	public static void main(String[] args) {
		//EzenComputer의 객체 생성 후 출력
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
		Scanner scan = new Scanner(System.in);
		
		std[2].insertCourse("java", "6개월");
		std[2].insertCourse("html", "6개월");
		std[3].insertCourse("html", "8개월");
		std[3].insertCourse("DB", "9개월");
		std[4].insertCourse("java", "1개월");
		std[5].insertCourse("html", "4개월");
		
		
		String searchName = "나가";
		
		String searchBranch = "인천";
		
		String searchCourse = "java";
		
		//equals, contains
		
		System.out.println();
		System.out.println("------------------------");
		
		for(EzenComputer_선생님풀이 tmp : std) {
			if(tmp.getName().equals(searchName)) {
				System.out.print("학생정보 : ");
				tmp.printInfo();
				System.out.print("수강 정보 : ");
				tmp.printCourse();
				break;
			}else {
				System.out.println("학생이 없습니다.");
				break;
			}
		}
		
		System.out.println();
		System.out.println("------------------------");
		
		for(EzenComputer_선생님풀이 tmp : std) {
			if(tmp.getBranch().equals(searchBranch)) {
				System.out.print("학생정보 : ");
				tmp.printInfo();
				break;
			}else {
				System.out.println("학생이 없습니다.");
				break;
			}
		}
		
		
		
	}

}
