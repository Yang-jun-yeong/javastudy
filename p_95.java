import java.util.Scanner;

public class p_95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = sc.nextInt();
		if(score>=85) {
			System.out.println("축하합니다! 합격입니다.");
		}
		sc.close();
		
	}

}
