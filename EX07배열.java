package �������迭;

import java.util.Scanner;

public class EX07�迭 {

	public static void main(String[] args) {
		//�Է��ϴ� ���� ��������
		// 1) �Է��ϴ� ���� ��������
	      Scanner sc = new Scanner(System.in);
	      // 2) ���� ���� 5���� ������ �� �ִ� �迭
	      int[] stars = new int[5];
	      
	      for(int i = 0; i < stars.length; i++) {
	         // i 0 1 2 3 4 (5�� �ݺ�)
	         System.out.print(i+1+"��° ���� ������ �Է� >> ");
	         stars[i] = sc.nextInt();
	      }
	      
	      // 3 3 4 2 1
	      for(int j = 0; j < stars.length; j++) {
	         System.out.print(stars[j]+" : ");
	         for(int i = 1; i <= stars[j]; i++) {
	            System.out.print("*");
	         }System.out.println();
	      }
	      
	      
	      
	   }

	}
