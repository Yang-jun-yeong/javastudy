package if_else문;

import java.util.Scanner;

public class EX01if_else문 {

	public static void main(String[] args) {
		// if-else문
		// : 조건식의 참/거짓에 대한 실행코드를 작성해보자

		// if(조건식){조건식이 TRUE일경우 동작하는 실행코드}
		// else{조건식이 false일 경우 동작하는 실행코드}

		// ctrl +a :전체선택
		// ctrl +shift + f : 코드정리

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

}
