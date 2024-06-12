package 일차원배열;

import java.util.Scanner;

public class EX08배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer [] = {1,4,3,2,1};
		int user [] = new int [5];
		
		int sum = 0;
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요.");
		
		
		for(int i= 0; i<user.length; i++) {
			System.out.print(i+1+"번답 >>");
			 user[i]=sc.nextInt();
		}
		
		System.out.println("정답확인");
		
		for(int i=0; i<5;i++) {
		if(answer[i]==user[i]) {
			System.out.print("o ");
			sum = sum+20;
		}else {
			System.out.print("x ");
		}

	}
		System.out.print("총 점 : "+sum);
		

}
}