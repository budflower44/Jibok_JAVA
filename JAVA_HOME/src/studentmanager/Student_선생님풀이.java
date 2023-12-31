package studentmanager;

public class Student_선생님풀이 {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스 
	 * = 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * - (학생이 수강을 신청하는 메서드(각 배열을 채우는 메서드/배열이 꽉찼을때 배열 늘리기), 철회하는 메서드(각 배열을 삭제하는 메서드), 기타 출력)
	 * */
	
	private String stdNum;
	private String stdName;
	private String stdresisterNum;
	private String faculty;
	private String major;
	private Subject_선생님풀이[] subjectList = new Subject_선생님풀이[5]; //subject 클래스를 배열로
	private int subCount; //배열의 index 처리를 위한 변수
	
	//생성자
	public Student_선생님풀이() {}

	public Student_선생님풀이(String stdNum, String stdName, String stdresisterNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdresisterNum = stdresisterNum;
		this.faculty = faculty;
		this.major = major;
	}

	
	//메서드
	//학생 정보만 출력하는 메서드
	public void stdPrint() {
		System.out.println("학생명(학번): "+stdName+"("+stdNum+")");
		System.out.println("학부(학과): "+faculty+"("+major+")");
	}
	
	//수강 과목을 출력하는 메서드
	public void subPrint() {
		//수강과목 없을 때
		if(subCount ==0) {
		System.out.println("수강 중인 과목이 없습니다.");
		}
		//수강 과목이 있을때 : 배열을 출력
		for(int i=0; i<subCount; i++) {
			//toString을 이용하여 출력
			System.out.println(subjectList[i]);
			
			//메서드를 이용하여 출력
			//subjectList[i].메서드명(); //메서드 호출
		}
	}
	
	//수강과목 추가(신청) => subjectList 배열에 값이 들어가는 것.
	public void insertSubject(Subject_선생님풀이 s) {
		//배열이 다 찼다면 늘려주기
		if(subCount == subjectList.length) {
			//새로운 배열을 생성 기존+5
			Subject_선생님풀이[] tmp = new Subject_선생님풀이[subjectList.length+5];
			//arraycopy 이용하여 기존배열 => 신배열에 복사
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);
			//배열의 교체
			subjectList = tmp;
		}
		subjectList[subCount] = s;
		subCount++; //배열의 index 추가
	}
	
	//수강과목 삭제(철회)
	public void deleteSubject(String subName) {
		//과목의 위치를 찾기위한 index번지.
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i=0; i<subCount; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//찾았을 경우 삭제
		//뒷번지의 과목을 앞번지로 옮기는 작업
		for(int i= index; i<subCount-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		//마지막 번지는 null로 채우기
		subjectList[subCount-1] =null;
		subCount--;
		
	}
	
	
	
	public String getStdNum() {
		return stdNum;
	}
	
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public String getStdresisterNum() {
		return stdresisterNum;
	}
	
	public void setStdresisterNum(String stdresisterNum) {
		this.stdresisterNum = stdresisterNum;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public Subject_선생님풀이[] getSubjectList() {
		return subjectList;
	}
	
	public int getSubCount() {
		return subCount;
	}

}
