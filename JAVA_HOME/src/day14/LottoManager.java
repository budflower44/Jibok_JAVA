package day14;

import java.util.Scanner;

public class LottoManager implements LottoProgram {
	
	private LottoE le = new LottoE();
	
	//로또 번호 생성 (수동)
	@Override
	public void createLotto(Scanner scan) {
		System.out.println("1~45 숫자 중 6개를 입력해주세요 (Enter)");
		le.scanArray();
	}
	
	//로또 번호 생성 (자동)	
	@Override
	public void createLottoAuto() {
		// TODO Auto-generated method stub
		
	}
	
	//당첨 번호 생성 (자동)
	@Override
	public void insertLottoAuto() {
		System.out.println("--당첨 번호 자동 생성--");
		le.comLotto();
	}
	
	//당첨 번호 (내역) 확인 
	@Override
	public void checkLotto() {
		// TODO Auto-generated method stub
		
	}
	
	// 당첨 번호 리스트 확인
	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
		
	}

}
