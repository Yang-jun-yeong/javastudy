package while문;

import java.util.Scanner;

public class EX01while문 {

	public static void main(String[] args) {
		// while문
		// 반복 횟수가 정혀져 있지 않는 경우 사용한다.
		// ex) 사용자가 5라는 숫자를 입력하면 멈출껀데
		// 몇번째에서 5라는 숫자를 입력할 지 모름
		
		// while문의 구조
		// while(조건식){조건식이 true일 동안 실해오디는 코드}
		
		//1) 조건식을 사용해서 while문을 멈춰보자
		int num=1;
		
		// 2) 조건식을 true
		// 종료 조건을 준다.
		while(true) {
			System.out.println("출력");
			num++;
			if(num==10) {
				break;
				//반복문을 종료시키는 키워드
			}
		}
	
		// 실습) 사용자로부터 숫자를 입력받는 걸 반복
		// 사용자가 숫자로 7을 입력하면 멈추게 만들자	
	
		Scanner sc = new Scanner(System.in);
		
		
		
//		while(true) {
//				System.out.print("정수 입력 :");
//			int n = sc.nextInt();
//			//종료조건
//			if(n==7) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}
		
		int cnt = 0;
		while(cnt!=7) {
			System.out.print("정수 입력 : ");
			cnt = sc.nextInt();
	
	}
		System.out.println("프로그램이 종료되었습니다.");
		
}
}