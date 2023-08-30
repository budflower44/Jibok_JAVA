package day09;

public class 과제 {

	public static void main(String[] args) {
		//클래스 객체 생성 (2명)
		//값을 입력 후 정보출력 (2명)
		
		Students st1 = new Students();
		st1.setX("김현정");
		st1.setY(25);
		st1.setZ("010-0524-2584");
		st1.setT("인천시 남동구 안되요");
		
		Students st2 = new Students();
		st2.setX("편주영");
		st2.setY(30);
		st2.setZ("010-0544-4584");
		st2.setT("수원시 팔달구 안되요동");
		
		st1.print();
		st1.printAdress();
		
		System.out.println();
		st2.print();
		st2.printAdress();
		
		
	}

}

//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소 (보고싶을때만 출력)
//출력
//이름(나이) 전화번호

class Students {
	private String x;
	private int y;
	private String z;
	private String t;
	
	public void print() {
		System.out.print(x+"("+y+")"+" : "+z);
	}
	
	public void printAdress() {
		System.out.println(" / "+t);
	}
	

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
	
	
	
}