package 일차원배열;

public class EX03배열 {

	public static void main(String[] args) {
		int arr [] = {23,45,95,17,6,89,47,56,68,71};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<=arr.length-1; i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		
		// - {} scope(영역)
		// - 지역변수 : 특정 구역에서만 사용할 수 있도록 선언 및 초기화
		// - 전역변수 
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : "+ min);
	}

}
