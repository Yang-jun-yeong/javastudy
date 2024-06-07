package while문;

import java.util.Scanner;

public class EX02_2while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		//sum이 while문 안에 초기화 되어있으면
		// 계속해서 0으로 초기화 되기 때문에 반복 안에서
		// 영향을 받지 않도록 while문 밖으로 뺴준다.
		
		
		while(true) {
			System.out.print("숫자 입력 :" );
			int num = sc.nextInt();
			
			// 사용자가 입력한 숫자들의 총합
			sum = sum+num; 
			System.out.print("누적 결과 :" + sum );
			
			// 3) 종료조건
			// 사용자가 입력한 값(num)== -1
			if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
