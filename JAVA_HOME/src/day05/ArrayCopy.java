package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* arraycopy : 배열 복사
		 * 해당하는 값의 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘이거나 줄일 수 없음.
		 * 이후 추가/삭제가 불가능.
		 * 배열의 길이를 늘이거나 줄이고 싶을 경우 배열 복사를 통해
		 * 길이를 조절.
		 * */
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("------------");
		
		//수동으로 배열을 복사
		int arr1[] = new int[arr.length*2]; 
		
		//arraycopy를 이용
		System.arraycopy(arr, 0, arr1, 0, arr.length);
//		for(int i=0; i<arr1.length; i++) {
//			arr1[i] = arr[i];
//		}
		
		for(int tmp : arr1) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("==============");
		
		/* 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 출력 (향상된 for문으로 출력)
		 * 
		 * 5개의 값을 담을 수 있는 String 배열을 생성한 후 arraycopy
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 * */
		
		String arr2[] = new String[3];
		arr2[0] = "국어";
		arr2[1] = "영어";
		arr2[2] = "수학";

		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("------------");
		String arr3[] = new String[5]; 
		
		System.arraycopy(arr2,0,arr3,0,arr.length);
		arr3[3] = "사회";
		arr3[4] = "과학";
		
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("===========");
		
		//선생님 풀이 (보충)
		String[] str = new String[] {"국어", "영어", "숫자"};
		for(String s : str) {
			System.out.println(s);
		}
//		String str2 = new String[5];
//		System.arraycopy(str, 0, str2, 0, str.length);
//		System.out.println("---------");
//		str2[3]="사회";
//		str2[4]="과학";
//		for(String)
		
		
		// 예외 연습
		// copy 배열 숫자가 더 적은 경우
		String arr4[] = new String[3]; // String은 new 없어도 사용가능
		arr4[0] = "국어";
		arr4[0] = "영어";
		arr4[0] = "수학";
		
		
		
		
	}

}