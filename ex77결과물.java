package while문;

public class ex77결과물 {

	public static void main(String[] args) {
		int sum = 0 ,start =1;
		
		for(int i= 77; i >=1; i--) {
			sum = sum+i*start;
			start++;
		}

		System.out.println(sum);
	}

}
