package 메서드;

public class EX05메서드실습 {

	public static void main(String[] args) {
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);

	}//main밖
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
		}
	public static void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void div(int num1, int num2) {
		System.out.println(num1%num2);
	}

}
