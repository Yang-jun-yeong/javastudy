package �������迭;

import java.util.Scanner;

public class EX05�迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int [10];
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+1+"��° ���� �Է� >>");
			arr[i] =sc.nextInt();
			
			}
		
		System.out.print("3�� ��� : " );
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		}

	}

