package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		//EzenComputer의 객체 생성 후 출력
		EzenComputer ec = new EzenComputer("김슬미", "010-6689-4485");
		ec.setBranch("인천지점");
		ec.printStudentInfo1();
		System.out.println();
		ec.printCompayInfo();
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("수강 과목을 입력해주세요.");
		ec.inputCourser();		
		System.out.println("수강 기간을 입력해주세요.");
		ec.inputPeriod();
		System.out.println();
		System.out.println("--------------------------");
		ec.printSubjectInfo();
		
		System.out.println();
		System.out.println("--------------------------");
		EzenComputer ec1 = new EzenComputer("김똥개", "010-4444-8888", "009050", 25);
		ec1.printStudentInfo2();
		System.out.println();
		ec.printCompayInfo();
	}
	//생성자
	
	
}
