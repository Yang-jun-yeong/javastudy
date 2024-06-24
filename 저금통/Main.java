package 저금통;

public class Main {

	public static void main(String[] args) {

		// 1) PiggyBank 설계도를 사용해서 객체생성
		// pig
	
		PiggyBank pig = new PiggyBank();
		// 2) pig에 money를 10000원으로 초기화 시키자
		// pig.money = 100000000;
		// 3) pig에 deposit이라는 기능을 사용해서
		// 5000원을 입금
		// 매개변수로 정수형 데이터 1개를 사용
		// 전달인자도 1개가 있다... 
		pig.deposit(5000);
		
		// 4) 잔액을 확인했을 때
		pig.showMoney();// 15000원
		
		// 5) 돈을 인출 - 1200원
		pig.withdraw(1200);
		
		// 6) 잔액 확인 
		pig.showMoney(); // 13800원
		
		// 7) getter를 사용해서 잔액을 확인해보자!
		System.out.println(pig.getMoney());
		
		// 8) setter를 사용해서 잔액을 18000원으로 바꿔보자!
		pig.setMoney(18000);
		pig.showMoney();
		
	}

}
