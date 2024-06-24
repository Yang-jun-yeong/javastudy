package 월급관리프로그램;

public class TempEployee extends Employee{

	
	public TempEployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	@Override
	public int getMoneyPay() {
		return pay/12;
	}
	
	
	
}
