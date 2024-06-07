package for문;

public class EX01for문 {

	public static void main(String[] args) {
		
		//1) for문을 사용하여 21에서 57까지 출력하시오.
		
		//2) for문을 사용하여 96에서 53까지 출력하시오.
		
		//3) for문을 사용하여 21에서 57까지의 수 중 홀수만 출력하시오.
		
		
		//1)
		for(int i=21; i<58; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		//2)
		for(int j=96; j>=54; j--) {
			System.out.print(j + " ");
		}
		System.out.println();

		//3)
		for(int k=21; k<58 ; k+=2) {
			System.out.print(k+ " ") ;
		}
		System.out.println();
		// -홀수 인가를 판단해서 만증면 출력한다.
		
		// build up
		for(int i =21; i<=57; i++) {
		if(i%2==1) {
			System.out.print(i+ " ");
		}
		}
		
		
	}
	
	

}
