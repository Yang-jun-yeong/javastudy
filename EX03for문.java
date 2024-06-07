package for문;

import java.util.Scanner;

public class EX03for문 {

	public static void main(String[] args) {
		// 입력받은 정수의 약수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int n = sc.nextInt();
		
		int sum = 0;
		
		System.out.print(n+"의 약수: ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
				sum = sum+i;
			}
		}
		System.out.println();
		//약수의 총 합을 구하는 for문을 작성해 보자
		System.out.println("총합 :" +sum);
		
		//clean code라는 건 뭐지?
		//- 코드의 길이가 짧다
		//- 유지보수가 용이하다.
		//- 가독성이 뛰어나다
		//- 시간복잡도가 줄어든 코드이다.
		// : 실행시간
		
	}

}
