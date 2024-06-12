package 일차원배열;

public class EX02배열 {

	public static void main(String[] args) {
		// 배열을 임의의 값으로 초기화
		// 3,7,18,71,9,12,24
		//(1차원 정수형 배열 -arr)
		//배열의 값 중 홀수인 값이 몇개인지 출력하는 프로그램을 작성하시오
		
		int arr [] = {3,7,18,71,9,12,24};
		int cnt=0;
		System.out.print("array에 들어있는 홀수는 ");
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]%2==1) {
			cnt++;
			System.out.print(arr[i]+" ");
		}
		}
		System.out.println("이며, ");
		System.out.print("총 "+cnt+"개 입니다.");
		

	}

}
