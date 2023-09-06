package studentmanager;


public class Subject {
	
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 *  - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표 // 변수는 만들어두되, 생성자는 필요한 것만
	 *  - 멤버변수 선언, 생성자, getter/setter, 그 외 필요한 메서드
	 *  - (toString, print메서드)
	 * */
	
	protected String code, subjectName, period, progessorName, semester, schedule, point;

	
	public Subject() {}
	public Subject(String code, String subjectName, String period, String progessorName, String semester,
			String schedule, String point) {
		this.code = code;
		this.subjectName = subjectName;
		this.period = period;
		this.progessorName = progessorName;
		this.semester = semester;
		this.schedule = schedule;
		this.point = point;
	}
	
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	

	
	public void printSubject() {
		System.out.println("---수강신청 과목정보---");
		System.out.println("과목명: "+subjectName+", 학점: "+period+", 시수: "+period+", 교수명: "+progessorName+", 학기: "+semester+", 시간표: "+schedule);
	}
	
	

	@Override
	public String toString() {
		return "과목 정보 [과목코드: " + code + ", 과목명: " + subjectName + ", 학점: " + point + ", 시수: " + period + ", 교수명: "
				+ progessorName + ", 학기: " + semester + ", 시간표: " + schedule + "]";
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProgessorName() {
		return progessorName;
	}

	public void setProgessorName(String progessorName) {
		this.progessorName = progessorName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}
	
	
	
}
