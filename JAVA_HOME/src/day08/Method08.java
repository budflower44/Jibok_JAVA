package day08;

import java.util.Scanner;

public class Method08 {

	//공통 변수들 선언 == 멤버변수
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * 
		 * */
		int arr[] = new int[] {1,2,9,13,7,5,6,10,4,8,3,11, 12,14,15};
		printArray(arr);
		System.out.println();
		System.out.println("-----------------");
		printArray_(arr);
		System.out.println();
		System.out.println("-----------------");
		printArray__(arr);
		
		int arr1[] = array(arr);
		System.out.println();
		System.out.println("-----------------");
		printArray__(arr1);
		
		System.out.println();
		System.out.println("--정렬 후--");
		sortArray(arr);  // 답이 안나와 보충
		printArray(arr);
		
		System.out.println();
		System.out.println("--랜덤 생성, 정렬--");
		System.out.println("--배열 개수 입력--");
		int co = scan.nextInt();
		arr = randomArray(co);
		array(arr);
		printArray__(arr);

		// 밑에 메소드 보충
//		System.out.println();
//		System.out.println("-----------------");
//		int arr1[] = randomArray(20);
//		printArray(arr1);
//		System.out.println();
//		System.out.println("-----------------");
//		sortArray(arr1);
//		printArray(arr1);
		
	}
	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : X
	 * 메서드명 : printArray
	 * 옆으로 출력 5개씩 한줄로 나열
	 * */
	public static void printArray(int arr[]) {
		int pA[] = new int[5];
		for(int i=0; i<=pA.length; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(arr[i]+" ");
				if(i==arr.length) {
					System.out.println();
				} 
			}
		}
	}
	
	//선생님 풀이
	public static void printArray_(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i!=0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void printArray__(int arr[]) {
		int row = (int)Math.ceil((double)arr.length / 5);
		int cnt = 0;
		a: for(int i=1; i<=row; i++) { // 행
			for(int j=1; j<=5; j++) {  // 열
				System.out.print(arr[cnt]+" ");
				cnt++;
				if(cnt==arr.length) {
					break a;
				}
			}
			System.out.println();
		}
	}
	
	/* 주어진 정수배열을 정렬하는 기능
	 * 
	 * */
	
	public static int[] array(int arr1[]) { // arr1로 받았으니까
		//int arr1[] = new int[15]; // arr1로 받은 값을 정렬하기
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {  // 이렇게 정렬하면 계산을 더 많이 시킴 >> 쓸데없는 일을 더 시킴
				if(arr1[i]<arr1[j]) {
					int tmp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = tmp;
				}
			}
		}
		return arr1;
	}
	
	//선생님 풀이
	/* 주어진 정수배열을 정렬하는 기능
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : void
	 * 메서드명 : sortArray()
	 * */
	public static void sortArray(int arr[]) { // 5 3 1 => 3 5 1 => 1 5 3
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 배열개수
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray()
	 * */
	
	public static int[] randomArray(int co) {
		int[] array = new int[co];
		for(int i=0; i<=array.length-1; i++) {
			array[i] = (int)(Math.random()*100)+1;
		}
		return array;
	}
	
	// 선생님 풀이
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 배열개수
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray()
	 * */
//보충
//	public static int[] randomAraay_(int size) {
//		int arr[] = new int[size];
		
//	}
	
	
	
	
}