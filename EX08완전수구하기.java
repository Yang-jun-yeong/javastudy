package �޼���;

public class EX08���������ϱ� {

	public static void main(String[] args) {
		// ���⿡�ٰ� Ǯ�� ��� �޼���
		
		// isDivisor() : ������� �ƴ����� �˷��ִ� �޼���
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		
		System.out.println(divisor);
		
		//is~:����Ÿ���� boolean
		
		//2) getDibisor(x) : ����� ������ �����ִ� �޼���
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		int num =10;
		int result = getSumOfDivisors(num);
		System.out.println(num+"�� ����� �� : " + result);
		
		getDivisor(num);
		
		// �������� �����ΰ�
		// : ���� ������ ������� ���� ���� ���� ��
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
	//1) isDivisor() : ������� �ƴ��� Ȯ�����ִ� �޼���
	
	public static boolean isDivisor(int num1, int num2) {
		return num1%num2 ==0? true: false;
	}
		
	   // 2) getDivisor(x) : ����� ������ �����ִ� �޼��� 
	   public static void getDivisor(int num) {
	      
	      // ���࿡ 4
	      for(int i = 1; i <= num; i++) {
	         if(isDivisor(num, i)) {
	            // num�� i�� �������� �� ������ ����������
	            // i�� num�� ������� �ƴ���
	            // isDivisor(num1, num2)
	            // num2�� num1�� ������� �ƴ���
	            // num1�� num2�� �������� �� ������ ����������
	            System.out.print(i+" ");
	         }
	      }System.out.println();
	      
	   }

	   //3)getSumOfDivisors(x) : ������� ���� ��������� �����ִ� �޼���
	   
	   public static int getSumOfDivisors(int num) {
		   
		   
		   //num�� ������� ��
		   
		   int sum=0;
		   for(int i = 1; i<=num/2; i++) {
			   if(isDivisor(num,i)) {
				   sum = sum+i;
			   }
		   }
		   return sum+num;
		   
	   }

	   //4) isPerfectNumber
		// ���� ������ ����� ���� ���� ������ Ȯ���ؼ� true/false�� ��������
		public static boolean isPerfectNumber(int num3) {
			return getSumOfDivisors(num3)-num3==num3?true:false;
		}


		//5) getPerfectNumber
		public static void getPerfectNumber(int startValue, int endValue) {
			
			System.out.print(startValue+"~"+endValue+"������ ������ : ");
			for(int i=startValue; i<=endValue; i++) {
				if(isPerfectNumber(i)) {
					System.out.print(i + " ");
				}
			}
			
		}
}