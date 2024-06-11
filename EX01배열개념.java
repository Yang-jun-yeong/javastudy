package 일차원배열;

public class EX01배열개념 {

	public static void main(String[] args) {
		
		//배열의 필요성
		String b1 = "양준영";
		String b2 = "방상제";
		String b3 = "김지호";
		String b4 = "김창민";
		String b5 = "조자연";
		//5명의 학생이름을 for문으로 사용하면 출력할 수 있지 않을까?
		
		//변수를 만드는건 서로 다른 공간이 5개 생기는것!(흩어져있음)
		//그래서 for문을 활용한 순차적인 접근은 불가능하게 만들어짐
		
		//이름을 관리하는 배열을 만들어주자
		//1) 배열을 생성하는 방법
		// 자료형[] 배열명 = new 자료형 [배열의크기];
		// 자료형 : 내가 배열에 저장하고 싶은 데이터들의 타입
		//[] --> 배열을 의미
		// new --> 동적 메모리를 새롭게 할당 해주는 키워드
		// 배열을 생성할 떄는 뒤쪽에서 반드시 크기를 정해줘야 한다.
		
		String [] names = new String [5];
		// - 배열은 인덱스 구조를 가지고 있다.
		// names : 레퍼런스형 변수(주소값을 저장하는 변수)
		int [] nums = new int[8];
		
		// 기본 데이터 타입이 저장되는 방법 (boolean, int, double, char..)
		// 레퍼런스형 데이터 타입이 저장되는 방법 (String, 배열)
		names[1] = b1;
		names[2] = b2;
		names[3] = b3;
		names[4] = b4;
		names[0] = b5;
		
		// ArraryIndexOutofBoundsException : 예외상황
		//- 실행을 시켜야 알 수 있는 에러
		// - 인덱스 값이 초과 / 없는 인덱스 값에 접근하면 발생하는 상황
		
		// index 기본적으로 0부터 시작한다.
		// names가 가질 수 있는 인덱스 값은 0~4
		
		
		// 인덱스를 변수로 사용/for문을 사용해서 names배열에
		// 저장되어있는 이름 5개를 출력해보자
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 학생수가 증가한다.
		//names[5] = "한재옥";
		// 앞에서 배열을 생성할 때 정해놓은 크기를 뒤에서 바꿀 수 없다.
		
		System.out.println(names.length); 
		 
		//실습) 배열을 임의의 값 8개로 초기화를 해보자
		// 7, 11, 20 ,30 ,5 ,45 ,17 ,9
		int num1 = 7;
		int num2 = 11;
		int num3 = 20;
		int num4 = 30;
		int num5 = 5;
		int num6 = 45;
		int num7 = 17;
		int num8 = 9;
		
		nums[0] = num1;
		nums[1] = num2;
		nums[2] = num3;
		nums[3] = num4;
		nums[4] = num5;
		nums[5] = num6;
		nums[6] = num7;
		nums[7] = num8;
		
		
		// 배열안에서 홀수만 출력해보자
		
		for(int j=0; j<nums.length;j++) {
		if(nums[j]%2==1) {
			System.out.println(nums[j] + " ");
		}
		
		}
		int cnt=0;
		// 배열안에 짝수의 개수를 출력해보자
		for(int k=0; k<nums.length; k++) {
			if(nums[k]%2==0) {
				cnt++;
			}
			
		}
		System.out.println("짝수의 개수 : "+cnt+"개");
		
		// 배열 안에 숫자들 중 가장 큰 값을 출력해 보자
		int max = nums[0];
		//배열이 다 음수로 초기화 되어있다면 0이라는 값은 최대값이 되어버린다.
		//비교를 하기 위해서는 배열안에 있는 숫자 데이터로만 진행될 수 있도록
		
		for(int p=0; p<nums.length; p++) {
			if(max<nums[p]) {
				max=nums[p];
			}
		}
		System.out.println("최대값은 " + max);
		}
		
	}