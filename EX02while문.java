package while문;

import java.util.Scanner;

public class EX02while문 {

	public static void main(String[] args) {

		//키보드로 입력받은 수가 10보다 작을때만 게속 정수를입력받으세요.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num>10) {
					System.out.println("종료되었습니다.");
					break;
			}
		}
	}
}
