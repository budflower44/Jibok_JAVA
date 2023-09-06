package day14;

public class LottoE extends Lotto{
	
	//멤버변수
	private int userLotto[] = new int[6];
	private Lotto comLotto[] = new Lotto[7];
	
	// 생성자
	public LottoE() {}
	public LottoE(int[] userLotto, Lotto[] comLotto) {
		super();
		this.userLotto = userLotto;
		this.comLotto = comLotto;
	}
	
	public LottoE(int[] lottoArray) {
		super.lottoArray = lottoArray;
	}
	
	public LottoE(int lottoArray[], int[] userLotto, Lotto[] comLotto) {
		super.lottoArray = lottoArray;
		this.userLotto = userLotto;
		this.comLotto = comLotto;
	}
	
	//메서드
	
	
	//완성된 배열을 중복 체크하는 메서드 필요
	
//	public void isUserLotto() {
//		a: for(int i = 0; i<userLotto.length; i++) {
//			if() {
//				System.out.println("숫자가 정상적으로 입력되었습니다.");
//				break a;
//			}else{
//				System.out.println("1~45 중 중복된 번호를 입력하셨습니다. 중복없이 다시 입력해주세요");
//				userLotto();
//				break a;
//			}			
//		}
//	}
	

	
	
	
	//당첨번호 저장하는 배열
	
	
	
	
	
	//getter/setter
	public void comLotto() {
		randomArray();
	}
	public int[] getUserLotto() {
		return userLotto;
	}
	public void setUserLotto(int[] userLotto) {
		this.userLotto = userLotto;
	}
	public Lotto[] getComLotto() {
		return comLotto;
	}
	public void setComLotto(Lotto[] comLotto) {
		this.comLotto = comLotto;
	}
	
	
	
	
}
