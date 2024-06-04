package 이항연산자;

import java.util.Scanner;

public class EX01산술연산자 {

	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /, %
		//숫자 2개 준비하기 (각각 num1, num2 라는 변수에 3과 7저장)
		int num1 = 3;
		int num2 = 7;
		// 복사하고 싶은 줄에 커서 : ctrl +alt + 위/아래 방향키
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		// 실습) 변수 num3와 num4에 사용자가 입력한 값이 저장될 수 있도록 만들어보자
		//Scanner - nextInt()
		// 그리고 나서 num3와 num4의 산술 연산자 들의 결과 값을 출력해보자
		// 단, /(몫)연산 결과값이 소수점이 보여지게 만들어 보자
		// hint) int / int -- int
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 >>");
		int num3 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >>");
		int num4 = sc.nextInt();
		
		System.out.println(num3+num4);
		System.out.println(num3-num4);
		System.out.println(num3*num4);
		System.out.println((double)(num3/num4));
		System.out.println(num3%num4);
		
		// + : 문자열 연산도 가능하다
		System.out.println(7+3+"7");
		System.out.println(7+"3"+7);  
		System.out.println(7+"3"+7);
		// 숫자 +문자열
		//앞(뒤)에 숫자 데이터가 자동으로 문자열로 형변환 된다.
		
		//더하기 결과값 : 50
		System.out.println("더하기 결과값 : " +(num1+num2));
		
	}

}
