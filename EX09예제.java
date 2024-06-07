package while문;

import java.util.Random;
import java.util.Scanner;

public class EX09예제 {

	public static void main(String[] args) {
		// 랜덤으로 숫자를 가져와주는 기능을 한번 사용해보자
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==== Plus Game ====");
		//bound : 10 ---> 0~9
		// 0 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8 9 10
		// 1~10-->?
		
	while(true){
		
		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(10);
				
			
		System.out.print(num1+"+"+num2+"=");
		int my = sc.nextInt();
		if(my==num1+num2) {
			System.out.println("Success");
		}else {
			
			System.out.println("Fail");
			System.out.print("계속 하시겠습니까? >> ");
			String yn = sc.next();
			
			if(yn.equals("Y")||yn.equals("y")) {
				continue;
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		}
		
	}

}
