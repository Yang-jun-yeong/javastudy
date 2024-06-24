package 월급관리프로그램;

public class Main {

	public static void main(String[] args) {

		// RegularEmployee 생성자를 이용해서 객체 regular
		RegularEmployee regular 
		= new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		
		// 사원의 정보 출력하기
		// print - String 출력하는 기능은 x
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay()+"만원");
		
		TempEployee temp = new TempEployee("SMHRD002", "박문수", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay());
		
		
		PartTimeEmployee part 
		= new PartTimeEmployee("SMHRD001", "홍길동", 10, 10);
		System.out.println(part.print());
		System.out.println(part.getMoneyPay());
		
		
		
		
	}

}
