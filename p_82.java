import java.util.Scanner;

public class p_82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int time = sc.nextInt();
		int hour = (time/3600);
		int minute = (time%3600)/60;
		int second = time%60;
		
		System.out.println("현재시간은"+hour+"시간"+minute+"분"+second+"초입니다.");
		
	}

}
