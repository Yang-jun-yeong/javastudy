package 일차원배열;

import java.util.Random;

public class EX06배열 {

	public static void main(String[] args) {
		Random rd = new Random();
		int lotto [] = new int[5];
		
		// lotto라는 정수형 5크기의 배열을 생성
		
		
		System.out.println("=====로또타임=====");
			
		for(int j = 0; j<lotto.length; j++) {
			 lotto[j] = rd.nextInt(10)+1; //1~10사이의 난수 생성
			
			for(int i=0; i<j; i++) {
				if(lotto[j]==lotto[i]) {
					j--;
					break;
				}
			}
		
		}
			
		
	/*	// 0번 인덱스에 값을 할당
		lotto[0] = rd.nextInt(10)+1;
		//이전에 인덱스에 같은 값이 있는지 확인
		//1번 인덱스에 값을 할당
		lotto[1] = rd.nextInt(10)+1;
		//0번 인덱스의 값과 같은지 확인
		for(int i =0; i<1; i++) {
		if(lotto[1]==lotto[0]) {
			
		}
		}
		//2번 인덱스에 값을 할당
		lotto[2] = rd.nextInt(10)+1;
		//0,2번 인덱스의 값과 같은지 확인
		
		for(int i =0; i<2; i++) {
		if(lotto[2]==lotto[i]) {
			
		}
	}
		
			
		*/
		
		
		System.out.println("이번주 출력번호는요...!!! 두구두구두구둑!!!!");
		
		for(int i=0; i<5;i++) {
			System.out.print(lotto[i]+" ");
			
		}
	}

}