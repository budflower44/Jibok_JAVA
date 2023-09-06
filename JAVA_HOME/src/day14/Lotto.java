package day14;

import java.util.Scanner;

public class Lotto {
	//멤버변수 선언
	protected int lottoArray[] = new int [6]; //로또 번호
	protected String user;
	protected String computer;
	protected int cnt=0; // 배열의 index 넘버 카운트 변수 
	
	
	//생성자
	public Lotto () {}

	
	public Lotto(int [] lottoArray) {
		this.lottoArray = lottoArray;
	}

	public Lotto(int [] lottoArray, String user, String computer) {
		this.lottoArray = lottoArray;
		this.user = user;
		this.computer = computer;
	}
	
	Scanner scan = new Scanner(System.in);
	
	//메서드
	//로또 번호 수동 생성 (입력값으로 배열 채우기)
	public void scanArray() {
		for(int i=0; i<lottoArray.length; i++) {
			System.out.println("--로또 번호(수동) 입력--");
			lottoArray[i] = scan.nextInt();
			cnt++;			
			while(cnt<6) {
				if(!isContain(lottoArray, lottoArray[cnt])) {
					lottoArray[i] = lottoArray[cnt];
					i++;
				}
			}
			return;
		}
	}
	
	//수동생성 중복체크

	
	// 로또 번호 출력 
	public void lottoPrint(int lottoArray[]) {
		for(int i=0; i<lottoArray.length; i++) {
			System.out.println(lottoArray[i]);
		}
	}
	
	
	//임의의 로또 번호 자동 생성 (당첨번호 or 자동 생성)
	public int random () {
		return (int)(Math.random()*45)+1;
	}
	
	//중복 없이 채우기
	public void randomArray(){
		int i=0;
		while(i<lottoArray.length) {
			int r = random();
			if(!isContain(lottoArray,r)) {
				lottoArray[i] = r;
				i++;
			}
		}
	}
	
	//중복체크 메서드
	public boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}

	
	//getter/setter
	public int[] getLottoArray() {
		return lottoArray;
	}
	
	
	public void setLottoArray(int[] lottoArray) {
		this.lottoArray = lottoArray;
	}
	
	
	public String getUser() {
		return user;
	}
	
	
	public void setUser(String user) {
		this.user = user;
	}
	
	
	public String getComputer() {
		return computer;
	}
	
	
	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	
}
