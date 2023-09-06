package day05;

public class Array02 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력
		 * */
		
		// 1. 5개의 값을 가지는 배열 생성
		// 2. arr[i]에 1~50사이의 랜덤 수 저장
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.println(arr[i]);
		}
		
		// 선생님 풀이
		int arr_[] = new int[5]; // 0 1 2 3 4
		//arr.length = 5
		for(int i=0; i<arr_.length; i++) {
			arr_[i] = (int)(Math.random()*50)+1;
			System.out.println(arr_[i]);
		}
		System.out.println();
		System.out.println("-------------------");
		
		//정렬(오름차순) 교환)
		//4 37 23 9 43
		//4 37 23 9 43   4와 뒤의 수를 각각 비교 pass1
		//4 9 23 37 43  37와 뒤의 수를 각각 비교 pass2
		//4 9 23 37 43  37와 뒤의 수를 각각 비교 pass3
		//4 9 23 37 43  pass4
		
		// 4 23 9 37 43  pass1 (더블정렬)
		//4 9 23 37 43  pass2
		
		// 이중 for문 필요
		for(int i = 0; i<arr.length-1; i++) {  // OR i<arr.length;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for >");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		
		

		
	}

}