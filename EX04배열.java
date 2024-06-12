package 일차원배열;

import java.util.Scanner;

public class EX04배열 {

	public static void main(String[] args) {
		//1) 점수가 저장될 수 있는 배열
		//크기 5, int
		
		//2) 이름은 score[0] ~[4] = sc.nextInt()
		
		//3) 입력된 값을 한번 출력
		//4) 최대/최소값을 출력
		//5) 총합, 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int [5];
		
		
		
		
		
		for(int i =0; i<score.length;i++) {
			System.out.print(i+1+"번째 입력>>");
			score [i] = sc.nextInt();
		}
			System.out.print("입력된 점수: ");
		
		
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
		System.out.println("최대값 : " +max );
		System.out.println("최소값 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		
	}

}
