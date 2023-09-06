package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt => 파일명과 확장자를 분리하여 출력
		 * 
		 * */
		String fileName = "이것이자바다.txt";
		
		String[] str = fileName.split(".");
		System.out.println(str);
		for(String s : str) {
			System.out.println(s);
		}
		
		//선생님 풀이
		String file = fileName.substring(0, fileName.indexOf("."));
		System.out.println("file:"+file);
		
		String sux = fileName.substring(fileName.indexOf("."));
		System.out.println("확장자:"+sux);
		
		//contains(str) : 해당글자를 포함하고 있는지를 체크 boolean
		System.out.println(fileName.contains("자바"));
		
		
	}

}