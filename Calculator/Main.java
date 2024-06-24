package Calculator;

public class Main {

	public static void main(String[] args) {

		
		// 1) 
		Calculator cal = new Calculator(45, 50);
		// 2)
		// cal.sum();
		System.out.println(cal.sum());
		// 3) 
		cal.setNum1(75);
		cal.setNum2(5);
		// 4) 
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
		
		
		
		
	}

}
