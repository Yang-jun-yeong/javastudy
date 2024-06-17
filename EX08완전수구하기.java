package 메서드;

public class EX08완전수구하기 {

	public static void main(String[] args) {
		// 여기에다가 풀기 모든 메서드
		
		// isDivisor() : 약수인지 아닌지를 알려주는 메서드
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		
		System.out.println(divisor);
		
		//is~:리턴타입이 boolean
		
		//2) getDibisor(x) : 약수의 종류를 보여주는 메서드
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		int num =10;
		int result = getSumOfDivisors(num);
		System.out.println(num+"의 약수의 합 : " + result);
		
		getDivisor(num);
		
		// 완전수란 무엇인가
		// : 나를 제외한 약수들의 합이 나와 같은 것
		//ex) 6: 1 2 3 6
		
		
		   //4) isPerfectNumber
			int num3 =28;
			boolean result2 = isPerfectNumber(num3);
			System.out.println(result2);  // true
			
			
			//5) getPerfectNumber
			int startValue = 2;
			int endValue = 1000;
			getPerfectNumber(startValue,endValue);
			
			// isPerfectNumber
	}
	//1) isDivisor() : 약수인지 아닌지 확인해주는 메서드
	
	public static boolean isDivisor(int num1, int num2) {
		return num1%num2 ==0? true: false;
	}
		
	   // 2) getDivisor(x) : 약수의 종류를 보여주는 메서드 
	   public static void getDivisor(int num) {
	      
	      // 만약에 4
	      for(int i = 1; i <= num; i++) {
	         if(isDivisor(num, i)) {
	            // num을 i로 나누었을 때 나누어 떨어지는지
	            // i가 num의 약수인지 아닌지
	            // isDivisor(num1, num2)
	            // num2가 num1의 약수인지 아닌지
	            // num1을 num2로 나누었을 때 나누어 떨어지는지
	            System.out.print(i+" ");
	         }
	      }System.out.println();
	      
	   }

	   //3)getSumOfDivisors(x) : 약수들의 합을 결과값으로 돌려주는 메서드
	   
	   public static int getSumOfDivisors(int num) {
		   
		   
		   //num의 약수들의 합
		   
		   int sum=0;
		   for(int i = 1; i<=num/2; i++) {
			   if(isDivisor(num,i)) {
				   sum = sum+i;
			   }
		   }
		   return sum+num;
		   
	   }

	   //4) isPerfectNumber
		// 나를 제외한 약수의 합이 나와 같은지 확인해서 true/false를 돌려주자
		public static boolean isPerfectNumber(int num3) {
			return getSumOfDivisors(num3)-num3==num3?true:false;
		}


		//5) getPerfectNumber
		public static void getPerfectNumber(int startValue, int endValue) {
			
			System.out.print(startValue+"~"+endValue+"까지의 완전수 : ");
			for(int i=startValue; i<=endValue; i++) {
				if(isPerfectNumber(i)) {
					System.out.print(i + " ");
				}
			}
			
		}
}