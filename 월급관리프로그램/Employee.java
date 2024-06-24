package 월급관리프로그램;

public abstract class Employee {

	// 3가지의 Employee들이 가지고 있는 공통적인 필드/메서드
	
	String empno;
	String name;
	int pay;
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	public String print() {
		return empno+":"+name+":"+pay;
	}
	
	// 월 급여 계산 결과값으로 돌려주는 메서드
	// regular, temp, parttime 다 다르게 구현을 할 예정
	public abstract int getMoneyPay();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
