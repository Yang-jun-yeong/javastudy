package �������迭;

import java.util.Random;

public class EX06�迭 {

	public static void main(String[] args) {
		Random rd = new Random();
		int lotto [] = new int[5];
		
		// lotto��� ������ 5ũ���� �迭�� ����
		
		
		System.out.println("=====�ζ�Ÿ��=====");
			
		for(int j = 0; j<lotto.length; j++) {
			 lotto[j] = rd.nextInt(10)+1; //1~10������ ���� ����
			
			for(int i=0; i<j; i++) {
				if(lotto[j]==lotto[i]) {
					j--;
					break;
				}
			}
		
		}
			
		
	/*	// 0�� �ε����� ���� �Ҵ�
		lotto[0] = rd.nextInt(10)+1;
		//������ �ε����� ���� ���� �ִ��� Ȯ��
		//1�� �ε����� ���� �Ҵ�
		lotto[1] = rd.nextInt(10)+1;
		//0�� �ε����� ���� ������ Ȯ��
		for(int i =0; i<1; i++) {
		if(lotto[1]==lotto[0]) {
			
		}
		}
		//2�� �ε����� ���� �Ҵ�
		lotto[2] = rd.nextInt(10)+1;
		//0,2�� �ε����� ���� ������ Ȯ��
		
		for(int i =0; i<2; i++) {
		if(lotto[2]==lotto[i]) {
			
		}
	}
		
			
		*/
		
		
		System.out.println("�̹��� ��¹�ȣ�¿�...!!! �α��α��α���!!!!");
		
		for(int i=0; i<5;i++) {
			System.out.print(lotto[i]+" ");
			
		}
	}

}