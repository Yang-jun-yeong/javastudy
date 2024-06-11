package 이중for문;

public class EX02약수구하기 {

	public static void main(String[] args) {
		
		// 이중 for문을 사용해서 2~30까지 숫자들의 약수를 구하자
		for(int j = 2; j<=30; j++) {
		
		System.out.print(j+"의 약수:" + " ");
		for(int i=1; i<=j; i++) {
			if(j%i==0)
			System.out.print( i + " ");
		}
		
		System.out.println();
		}
		
	}

}