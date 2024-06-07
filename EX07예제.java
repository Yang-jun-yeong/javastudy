package while문;

import java.util.Scanner;

public class EX07예제 {

	public static void main(String[] args) {

		
/*
		
		//숫자, 문자한개(char)의 같다를 비교할때
		// : ==
		
		//문자열이 같다는 것을 비교하는 경우에는
		// : equals()
		
		String name = "양준영";
		
		if(name.equals("양준영")) {
			System.out.println("로그인 성공");
		}
		
		// 입력하는 기능에서 문자열을 입력하는 건
		// : sc.next();
*/
		
		Scanner sc = new Scanner(System.in);
		
		// 로그인 실패 카운트하는 변수
		int fail = 0;
		
		while(true) {
			
			 fail++;
			System.out.print("아이디를 입력해 주세요 >> ");
			String id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >>");
			int pw = sc.nextInt();
			
			if(fail>=3) {
				System.out.print("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요.");
				break;
		   }
			
			if(id.equals("Hello")&&pw==1234) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				System.out.println("계속 하시겠습니까? (Y/N)");
			   String yn = sc.next();
			   
			  
			   
			   
			   if(yn.equals("N")) {
					System.out.println("종료합니다");
					break;
				}
			}
			
			}
		
		
						
			
	}

}



/*

while(true) {
    // 2) 아이디랑 비밀번호를 입력
    System.out.print("아이디를 입력해 주세요 >> ");
    String id = sc.next();
    System.out.print("비밀번호를 입력해 주세요 >> ");
    int pw = sc.nextInt();
    // 3) id, pw가 로그인 성공인지 아닌지 판단
    if(id.equals("Hello") && pw == 1234) {
       System.out.println("로그인 성공!");
       break;
    }else {
       
       
       // 로그인 실패를 카운트하는 어떤 변수가 +1
       cnt++;
       // 계속할껀지는 로그인 실패 횟수가 3보다 작을 때만 물어보자
       // 만약 3보다크면 출려문, break;
       // 계속 할껀지 ? - y/n - String
       if(cnt < 3) {
          // 로그인에 실패
          System.out.println("아이디와 비밀번호가 잘못되었습니다.");
          // 시도할 수 있는 기회가 남아있는 상태
          System.out.print("계속 하시겠습니까? (Y/N)");
          String select = sc.next();
          if(select.equals("N")) {
             System.out.println("종료되었습니다.");
             break;
          }else {
             continue;
             // while문 처음으로 돌아가는 키워드
          }
       }else {
          // 로그인 실패를 3회 이상 했을 때
          System.out.println("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요");
          break;
       }
       
       
       
       // 사용자가 y를 입력했는지 n을 입력했는지를 판단
       // n을 입력했으면
       // - 종료했습니다.
       // while문을 빠져나가는 키워드 break;
*/
