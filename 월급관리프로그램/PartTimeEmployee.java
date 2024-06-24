package 월급관리프로그램;

public class PartTimeEmployee extends Employee{


	int workDay; // 일수
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	// 월 급여
	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}
	
	
}
