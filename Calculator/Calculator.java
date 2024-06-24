package Calculator;

public class Calculator {

	
	private int num1;
	private int num2;
	
	// 1) 필드를 초기화 시키는 생성자
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;		
	}
	
	// 2) setter
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// 3) 일반 메서드
	
	public int sum() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public double div() {
		return num1/num2;
	}
	
	
	
	
	
}
