package �������迭;

import java.util.Scanner;

public class EX08�迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer [] = {1,4,3,2,1};
		int user [] = new int [5];
		
		int sum = 0;
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���.");
		
		
		for(int i= 0; i<user.length; i++) {
			System.out.print(i+1+"���� >>");
			 user[i]=sc.nextInt();
		}
		
		System.out.println("����Ȯ��");
		
		for(int i=0; i<5;i++) {
		if(answer[i]==user[i]) {
			System.out.print("o ");
			sum = sum+20;
		}else {
			System.out.print("x ");
		}

	}
		System.out.print("�� �� : "+sum);
		

}
}