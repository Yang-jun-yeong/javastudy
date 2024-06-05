package if_else문;

import java.util.Scanner;

public class EX02if_else문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 기능을 매번 첫번째에 작성하는 이유는
		// 해당 코드가 실행되기 전까지는 sc를 사용할수 없다.
		//그러므로 프로그램에서 사용하는 기능들을 import하는 코드는
		// 맨 상단으로 올려놓고 코드를 작성하자.
		
		System.out.print("사려는 상품 갯수를 입력하시오:");
		int price = sc.nextInt();
		
		//int price = 10000;
		
		if(price>=11) {
			System.out.println("상품의 가격은 " +(int)((price*10000)-(price*10000*0.1))+"원입니다.");
			
		//price = (int)(price*갯수*0.9)	
			
		}else {
			System.out.println((price*10000)+"원입니다.");
			
		//price = price*갯수	
		}
		//System.out.println("가격은"+price+"입니다.)
	}

}
