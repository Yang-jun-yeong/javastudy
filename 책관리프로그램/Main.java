package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1) BookData를 저장할 수 있는 배열을 5칸짜리로 선언 및 생성하기
		// - 이름은 books로 만들어주기
		BookData[] books = new BookData[5];
		// 2) BookData 객체 생성 진행하기 
		// - 이미지 2번 표에 있는 값으로 객체 생성 5번 진행하기
		// - 이름은 book1 ~ book5로 생성해주세요
		BookData book1 = new BookData("Java", 21000, "홍길동");
		BookData book2 = new BookData("C++", 29000, "박문수");
		BookData book3 = new BookData("Database", 31000, "김장독");
		BookData book4 = new BookData("Android", 18000, "이순신");
		BookData book5 = new BookData("Web", 26000, "김철수");
		// 3) book1 ~ book5를 배열에 담아주기
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		books[4] = book5;
		
		// 4) 사용자로 부터 금액을 입력받기
		System.out.print("금액을 입력하세요 : ");
		int price = sc.nextInt();
		// 5) 입력받은 가격보다 저렴한 책을 books에서 찾아서 목록과
		//    가격을 출력하기 
		// - 이미지 3번에서 콘솔창과 같은 형태로 출력해주세요
		System.out.println("구매 가능한 책 목록");
		
		for(int i = 0; i < books.length; i++) {
			if(price >= books[i].getPrice()) {
				System.out.print("["+books[i].getTitle()+",");
				System.out.print(books[i].getWriter()+","+books[i].getPrice()+"]");
			}System.out.println();
		}
		
			
		
		
		
		
		
		
		
		
		
	}
	
}
