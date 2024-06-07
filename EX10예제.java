package while문;

import java.util.Random;
import java.util.Scanner;

public class EX10예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int rdNumber = rd.nextInt(100)+1;
		 
		
		System.out.println("=====1부터 100사이 숫자 맞추기 게임!=====");
		
		while(true) {
		System.out.print("1과 100사이의 정수를 입력하세요 >>");
		int myNumber = sc.nextInt();
		
		if(myNumber==rdNumber) {
			System.out.println(rdNumber + " 정답입니다!!");
			break;
		} else if(myNumber>rdNumber) {
			System.out.println("더 작은 수로 다시 시도해보세요");
		} else {
			System.out.println("더 큰 수로 다시 시도해보세요");
		}
		}
		
				
	}

}
