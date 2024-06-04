package 이항연산자;

import java.util.Scanner;


public class EX02산술연산자 {

	public static void main(String[] args) {
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// ctrl + shift + o : import 자동 진행
		
		// 2) 사용자로부터 숫자 한개를 입력받아
		// 3) num에 저장
		int num = sc.nextInt();
		// 4) 백의자리 숫자 구하기
		System.out.println("백의자리 : " + (num/100));
		// 5) 십의자리 숫자 구하기 556->56->5
		System.out.println("십의자리 : " + ((num%100)/10));
		// 6) 일의자리 숫자 구하기
		System.out.println("일의자리 : " + ((num%10)));
		
		
		
		
		
		
	}

}
