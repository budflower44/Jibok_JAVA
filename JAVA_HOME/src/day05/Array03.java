package day05;

public class Array03 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 출력
		 * */
		
		//1. for문으로 1~10까지 담기
		//2. 배열 arr 생성하기
		
		int arr[] = new int[10];//00000000
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//				System.out.println(arr[i]);
//		}
		
		// 문제 : 반대로 정렬하기
		// 1. 배열 생성하기
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		// 2. 반대로 정렬하기 (교환) 
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];  // arr[i] 값 없어지지 않게 임시 변수에 넣어주고
					arr[i] = arr[j];  // if 조건에 맞을 경우 arr[i] 값에 arr[j] 값을 대입해주고
					arr[j] = tmp;     // 임시 변수에 저장한 값을 다시 arr[j]에 넣어 교환한다.
				}
			}
		}
		// 3. 순서대로 출력하기
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//선생님 풀이
		
		int arr_[] = new int[10];
		for(int i=0; i<arr_.length; i++) {
			arr_[i] = i+1;
			System.out.print(arr_[i]+" ");
		}
		
		//내림차순 정렬
		System.out.println();
		System.out.println("------------");
		for(int i=0; i<arr_.length-1; i++) {
			for(int j=i+1; j<arr_.length; j++) {
				// 추후 보충
			}
		}
		
		
		
		
		
		
	}

}



//if(arr[i] > arr[j]) { // 오름차순
//	//교환
//	int tmp = arr[i];
//	arr[i] = arr[j];
//	arr[j] = tmp;