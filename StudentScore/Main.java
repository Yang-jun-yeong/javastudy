package StudentScore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. StudentScore 자료형을 관리하는 배열생성하기
		// 크기는 3으로 이름은 score로 만들어주기
		StudentScore[] score = new StudentScore[3];		
		
		// 2. 값을 입력받아서 StudentScore를 초기화하기
		// 즉, 생성자를 사용해서 필드를 초기화를 진행하고
		// 사용자가 입력한 값을 전달인자로 사용하기
		// 이름이랑 3개의 점수를 사용자한테 입력받은 후
		// 4개의 입력받은 데이터를 
		// StudentScore라는 하나의 자료형으로 만들어주기!
		
		for(int i = 0; i < score.length; i++) {
			// i : 0 1 2
			System.out.print(i+1+"번째 학생의 이름을 입력하세요 >> ");
			String name = sc.next();
			System.out.print(i+1+"번째 학생의 Java점수를 입력하세요 >> ");
			int java = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Web점수를 입력하세요 >> ");
			int web = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Android점수를 입력하세요 >> ");
			int android = sc.nextInt();
			
			StudentScore stu = new StudentScore(name, java, web, android);
			score[i] = stu;
		}
		
		// 3. 2번에 해당하는걸 3번 진행해야함! - for문을 사용해서 반복
		// 0,1,2 인덱스에 사용자가 입력한 값이 각각 들어가줘야함
		
		// 4. 입력이 다 끝나고나면 for문을 사용해서 각각의 데이터를 출력
		// 0,1,2 인덱스에 저장되어있는건 주소값
		// 주소값을 참조해서 이름이랑 점수들을 출력해보자
		// (데이터를 가져와주는 기능은 없나? - getter가 만들어져있음)
		
		
		for(int i = 0; i < score.length; i++) {
			int sum = score[i].getScoreAndroid()+score[i].getScoreJava()+score[i].getScoreWeb();
			System.out.println(score[i].getName()+"님의 총점은 "
					+sum+"점,"
					+"평균은 "+sum/3+"입니다." );
		}
		
		
		
		
		
		
		
	}

}
