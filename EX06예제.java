package while문;

import java.util.Scanner;

public class EX06예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 :");
		int now = sc.nextInt();
		System.out.print("목표몸무게 :");
		int want = sc.nextInt();
		
		int week = 0;
		
		
		while(true) {
			week++;
			System.out.print(week+"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			now = now-minus;
			
			if(now<=want) {
				System.out.print(now+"kg 달성!! "+"축하합니다!!");
				break;
			}
			
			
		}
		

	}

}
