package 월급관리프로그램;

public class RegularEmployee extends Employee{
 
	int bonus;
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		
		super(empno, name, pay);
		
		// 부모 클래스에 생성자가 있으면, 반드시 자식클래스에 부모클래스
		// 생성자가 구현되어있어야한다
		
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}


	
	
}
