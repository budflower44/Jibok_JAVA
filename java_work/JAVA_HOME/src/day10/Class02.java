package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : 
		 * 메서드 : 전원, 스피드 up, 스피드 down, 브레이크
		 * 
		 * */
		Car c1 = new Car();
		
		int a =c1.power(false);
		
		if(a==1) {
			System.out.println("시동을 켭니다.");
		}
		if(a==-1) {
			System.out.println("시동을 끕니다.");
		}
		
		c1.speed(70);
		c1.speed(-70);
		
		
		
	}
	
	
	

}

class Car{
	
	private boolean power;
	private int speed;
	private int braekk;
	
	public Car() {}

	public Car(boolean power, int speed) {
		this.power = power;
		this.speed = speed;
	}
	
	public Car(boolean power, int speed, int breakk) {
		this(power, speed);
		this.braekk = breakk;
	}
	
	public int power (boolean power) {
		int a = 0;
		if(power == true) {
			a = 1;			
		}
		if(power == false) {
			a = -1;
		}
		return a;
	}
	
	public void speed(int sp1) {
		while(sp1!=0) {
			if(sp1>0) {
				for(int i = 0; i<sp1; i++) {
					speed++;
				}
				System.out.println("속도를"+speed+"만큼 올립니다.");
				break;
			}
			if(sp1<0) {
				for(int i=speed; i<-(sp1); i++) {
					speed--;
				}
				System.out.println("속도를"+speed+"만큼 내립니다.");
				break;
			}
		}
	}

	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBraekk() {
		return braekk;
	}

	public void setBraekk(int braekk) {
		this.braekk = braekk;
	}

	
	
}
