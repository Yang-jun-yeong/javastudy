package 메서드;

public class EX07메서드실습 {

	public static void main(String[] args) {
		int num1=10;
		int num2=24;
		int result = largerNumber(num1,num2);
		System.out.println("큰 수 확인 : " + result);

	}
	public static int largerNumber(int num1 , int num2) {
		
		int result = 0;
		
		if(num1==num2) {
			System.out.println("두 수는 같다");
		}else if(num1>num2) {
			return result = num1;
		}else {
			return result = num2;
		}
		return result;
	}
}
