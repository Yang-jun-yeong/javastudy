import java.util.Scanner;

public class EX00자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		int price = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		int select = sc.nextInt();
		
		int outer = 700;
		int twonine = 1000;
		int eggmong = 500;	
		
		System.out.println("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> " + select);
		if((int)select == 1&& price>outer) {
			System.out.println("잔돈 : " + (price-outer));
			System.out.println("천원 : " + ((price-outer)/1000)+"개" +" 오백원 : " + (((price-outer)%1000)/500)+"개"+ " 백원 : "+(((price-outer)%1000)%500)/100+"개");
		}
		
		else if((int)select ==2&& price > twonine) {
			System.out.println("잔돈 :" + (price-twonine));
			System.out.println("천원 : " + ((price-twonine)/1000)+"개" +" 오백원 : " + (((price-twonine)%1000)/500)+"개"+ " 백원 : "+(((price-twonine)%1000)%500)/100+"개");
		}
		
		else if((int)select ==3&& price > eggmong) {
			System.out.println("잔돈 :" + (price - eggmong));
			System.out.println("천원 : " + ((price-eggmong)/1000)+"개" +" 오백원 : " + (((price-eggmong)%1000)/500)+"개"+ " 백원 : "+(((price-eggmong)%1000)%500)/100+"개");
		}
		
		else if((boolean)(price < outer)||(price < twonine)||(price < eggmong)) {
			System.out.println("돈이 부족해요ㅠㅠ");
			System.out.println("잔돈 : " + price +"원");
		
		}
		
	}

}
