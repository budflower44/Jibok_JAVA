package day10;

public class Class03 {

	public static void main(String[] args) {
		/* TV 클래스 생성
		 * 멤버변수 : 브랜드, 크기, 가격
		 * 메서드 : 전원 on/off, 채널 up, 채널 down, 음량 up, 음량 down
		 * getter / setter 필요
		 * 생성자
		 * */
		
		TV t = new TV("삼성", "32인치", 100);
		t.powerOnOff(1);
		t.chanelUp(70);
		t.chanelDouwn(100);
		t.volumeUp(70);
		t.volumeDown(100);
	}

}

class TV {
//멤버변수 선언
	private String brand;
	private String size;
	private int price;
	private boolean power;
	private int chanel;
	private int volume;

//생성자
	public TV() {}
	public TV(String brand, String size, int price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

//메서드
//메서드 : 전원 on/off, 채널 up, 채널 down, 음량 up, 음량 down
	public void powerOnOff(int onoff) {
		if(onoff==1) {
			power = true;
			System.out.println("전원이 켜졌습니다.");
		}
		if(onoff==0){
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	public void chanelUp(int ch1) {
		if(power) {
			if(ch1<=100) {
				for(int i=0; i<ch1; i++) {
					chanel++;
				}				
				System.out.println("채널"+chanel+"번이 켜졌습니다.");
			}
			if(ch1>100) {
				chanel =ch1-100;
				for(int j=0; j<ch1; j++) {
					chanel++;
				}
				System.out.println("채널"+(chanel-100)+"번이 켜졌습니다.");
			}
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}		
		
	public void chanelDouwn(int ch1) {
		if(power) {
			if((chanel-ch1)>0) {
				for(int i=0; i<ch1; i++) {
					chanel--;
				}				
				System.out.println("채널"+(chanel)+"번이 켜졌습니다.");
			}
			if((chanel-ch1)<0) {
				chanel =-(100-ch1);
				System.out.println("채널"+(chanel)+"번이 켜졌습니다.");
				}
			}else {
			System.out.println("전원을 켜주세요.");
		}
	}		
		
	
	public void volumeUp(int vo1) {
		if(power) {
			for(int i=0; i>vo1;i++) {
				volume++;
			}
			System.out.println("현재 볼륨"+volume);
		}else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}
		
	public void volumeDown(int vo1) {
		if(power) {
			if(vo1>0) {
				volume--;
				System.out.println("현재 볼륨"+volume);	
			if((volume-vo1)<0) {
				for(int i=0; i>volume;i++) {
					volume--;
				}
				System.out.println("현재 볼륨"+volume+"최저볼륨 입니다.");					
			}	
		}else {
			System.out.println("TV 전원을 켜주세요.");
			}
		}	
	}
	
	
	

//getter/setter
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChanel() {
		return chanel;
	}
	public void setChanel(int chanel) {
		this.chanel = chanel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	


}