package �޼���;

public class EX07�޼���ǽ� {

	public static void main(String[] args) {
		int num1=10;
		int num2=24;
		int result = largerNumber(num1,num2);
		System.out.println("ū �� Ȯ�� : " + result);

	}
	public static int largerNumber(int num1 , int num2) {
		
		int result = 0;
		
		if(num1==num2) {
			System.out.println("�� ���� ����");
		}else if(num1>num2) {
			return result = num1;
		}else {
			return result = num2;
		}
		return result;
	}
}
