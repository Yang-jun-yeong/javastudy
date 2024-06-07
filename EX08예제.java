package while문;

import java.util.Scanner;

public class EX08예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
		System.out.print("첫 번째 정수를 입력하세요 >> ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 >> ");
		int second = sc.nextInt();
		
		int plus = first+second;
		int minus = first-second;
		
		System.out.print("[1]더하기 [2]빼기 >> ");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("더하기 연산 결과는" + plus + "입니다.");

	}else {
		System.out.println("빼기 연산 결과는" + minus + "입니다.");
		
	}
		System.out.println("다시 실행하시겠습니까? (Y/N)");
		String yn = sc.next();
		if(yn.equals("N")) {
			System.out.print("종료합니다.");
			break;
		}else {
			continue;
			//while 첨으로 돌아갑니다.
		}
}

}
}