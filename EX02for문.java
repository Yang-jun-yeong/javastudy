package for문;

import java.util.Scanner;

public class EX02for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1) 1~100까지의 수 중에서 3의 배수만 출력하세요.
		
		// 2) 1~100까지의 수 중 3의 배수이면서 5의 배수를 출력하세요.
		
		// 3) 한 개의 자연수를 입력받아 그 수의 배수를  
		// 차례대로 10개 출력하는 프로그램을 작성하시오
		
		
		//1)
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	
		//2)
		for(int i=1; i<=100; i++) {
			if(i%3==0&&i%5==0) {
				System.out.print(i + " ");
			}
			// if문은 실행코드가 한 줄이면 중괄호 생략 가능
		}
		System.out.println();
		//3)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =1; i<=10; i++) {
			System.out.print(num*i + " ");
		}
	}
	

}
