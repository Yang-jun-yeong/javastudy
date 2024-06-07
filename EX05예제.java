package while문;

import java.util.Scanner;

public class EX05예제 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int evenNumber = 0;
		int oddNumber =0;
		
		while(true){
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		
/*		if(num%2==0) {
		evenNumber = evenNumber+1;
		System.out.print("짝수개수: " + evenNumber);
		System.out.println();
		System.out.print("홀수개수: " + oddNumber);
		System.out.println();
		}else if(num%2==1){
		oddNumber= oddNumber+1;
		System.out.print("짝수개수: " + evenNumber);
		System.out.println();
		System.out.print("홀수개수: " + oddNumber);
		System.out.println();
		}else if(num==-1) {
			System.out.print("종료되었습니다.");
			break;
		}
*/
		
		switch(num) {
		case -1:
			System.out.print("종료되었습니다.");
			return;
		
		default:
			if(num%2==0) {
				evenNumber++;
			}else {
				oddNumber++;
			}
		System.out.println("짝수개수: "+evenNumber);
		System.out.println("홀수개수 "+oddNumber);
		break;
		}
		

	}

}
}