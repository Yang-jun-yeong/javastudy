package elseif문;

import java.util.Scanner;

public class EX03elseif문 {

	public static void main(String[] args) {
		//조건문
		// 1) 조건식을 사용해서 판단
		// 2) 조건문 안에 조건문을 넣어서 판단
		
		// 정보처리 기사 합격인지 불합격인지 판단
		
		// 1) 입력하는 기능 가져오기
		// 2) 출력문 + 입력문 *5
		// 5과목에 대해서 맞힌 개수를 입력받아보자
		// 그리고 각각 a,b,c,d,e 라는 변수에 저장해 보자
		
		// 3) 합격/불합격 여부를 출력
		// 합격 : 과락x, 평균 12개 이상
		// 불합격 : 과락o, 평균 12미만

		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int a = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int b = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int c = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int d = sc.nextInt();
		System.out.print("정보시스템 구축 관리 :" );
		int e = sc.nextInt();
		
		if((a+b+c+d+e>=60)&&(a>=8)&&(b>=8)&&(c>=8)&&(d>=8)&&(e>=8)) {
			System.out.println("합격입니다!.");
		}else if ((a<8)||(b<8)||(c<8)||(d<8)||(e<8)) {
			System.out.println("불합격입니다.");
		}
		

	}

}
