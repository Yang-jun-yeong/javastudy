package switch_case문;

import java.util.Scanner;

public class Ex02switch문 {

	public static void main(String[] args) {
		//사용자로부터 월을 입력받아서
		// 해당 월의 계절이 어떤 계절인지 출력해주는 프로그램
		
		//console
		//1월~12월 중 숫자 하나를 입력하세요 >> 5
		//현재 계절은 봄입니다.
		
		//단, switch case 문을 사용해서 결과값을 출력하기
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		
		
		switch(month) {
		case 1:
			System.out.println("겨울입니다.");
			break;
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
			System.out.println("봄입니다.");
			break;
		case 4:
			System.out.println("봄입니다.");
			break;
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
			System.out.println("여름입니다.");
			break;
		case 7:
			System.out.println("여름입니다.");
			break;
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
			System.out.println("가을입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11:
			System.out.println("겨울입니다.");
			break;
		case 12:
			System.out.println("겨울입니다.");
			break;
		}

	}

}
