package �������迭;

import java.util.Scanner;

public class EX04�迭 {

	public static void main(String[] args) {
		//1) ������ ����� �� �ִ� �迭
		//ũ�� 5, int
		
		//2) �̸��� score[0] ~[4] = sc.nextInt()
		
		//3) �Էµ� ���� �ѹ� ���
		//4) �ִ�/�ּҰ��� ���
		//5) ����, ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int [5];
		
		
		
		
		
		for(int i =0; i<score.length;i++) {
			System.out.print(i+1+"��° �Է�>>");
			score [i] = sc.nextInt();
		}
			System.out.print("�Էµ� ����: ");
		
		
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] +" ");
		}
		
		int max = score[0];
		int min = score[0];
		int sum=0;
		int average=0;
		
		for(int i = 0; i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
			
			sum+=score[i];
			
		}
		System.out.println();
		System.out.println("�ִ밪 : " +max );
		System.out.println("�ּҰ� : " + min);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/score.length);
		
	}

}
