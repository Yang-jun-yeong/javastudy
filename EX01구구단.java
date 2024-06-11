package 이중for문;

public class EX01구구단 {

	public static void main(String[] args) {
		//2단 ~ 9단 이중 for문을 사용해서 출력
		//build up
		//2단 for문을 사용해서 출력
		//3단 for문을 사용해서 출력
		
		for(int j=2;j<10;j++) {
		
		System.out.print(j+"단 :");
		for(int i=1;i<10;i++) {
		System.out.print(j+"*"+i+"="+j*i+" ");
		}
		
		System.out.println();
		
		}
		

	}

}
