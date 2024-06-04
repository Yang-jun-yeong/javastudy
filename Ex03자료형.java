
public class Ex03자료형 {

	public static void main(String[] args) {
		
		// 1.논리형
		// 1) boolean : 1byte(8bit = 2^8)
		// true/ false 값만 저장할 수 있는 자료형
		// 다른 값을 넣으면 type mismatch error 라는 오류형 메세지를 띄움
		
		boolean isHot = true;
		System.out.println(isHot);
		
		// 2. 문자형
		// 1) char : 2byte
		// 문자 한개를 저장할 수 있는 자료형
		//''(작은따옴표)로 감싸줘야 한다
		// + 유니코드 문자도 저장 할 수 있다
		char firstName = '양';
		
		// 3. 정수형
		// 1) byte : 1byte
		byte num1 = 127;
		// -128~127
		// 1byte - 8bit - 2^8 - 256개
		
		// 2) short : 2byte(16bit)
		short num2 = 128;
		
		// 3) int : 4byte - 정수형 데이터 타입 중에서 기본으로 사요오디는 자료형
		// -21억 ~ 21억
		int num3 = 200;
		// 이유 : 기본데이터 타입을 선언하면 메모리 공간을 차지하는데 공간을 좀더 효율적으로 사용하기 위해
		
		// 4) long : 8byte
		
		// 4.실수형 : 소수점이 붙은 순자들
		// 1) float : 4byte
		// 2) double : 8byte
		
		double pi1 = 3.141592;
		float pi2 = (float)3.141592;  // 뒤에 f를 붙이거나 앞에(float)를 붙이기
		
		// *형변환 (Cast/Casting) -convert... 오류 메세지
		
		// 1) 강제형변환(명시적형변환)
		// - 큰 자료형을 작은 자료형의 변수에 담을 때 진행
		// 명시를 하는 이유 : 이 곳에서 손실 값이 발생할 수 도 있다는 것을 알림
		// 2) 자동형변환(묵시적형변환)
		// - 작은 자료형을 큰 자료형의 변수에 담을 때 진행
		double pi3 = pi2; // pi2 ->float
		
		// + char 에 문자 한개도 담을 수 있고, 유니코드도 가능하다.
		// 97이라는 십진수 (숫자, 정수형) --->a
		
		int num = 97;
		//char자료형으로 형변환 해서 출력했을 때 a 라는 문자 한개가 console에 보이는지 확인해보자
		
		char ch = (char) num;
		
		System.out.println(ch);
		
		
		//만약에 문자 여러개를 저장하고 싶다면?
		//레퍼런스형 데이터 타입 
		// String : 문자열을 저장할 수 있는 데이터 타입
		
		//나의 이름을 저장할 수 있는 name이라는 변수를 만들어 보자
		String name = "양준영";
		System.out.println(name);
		
		// 주소값 : 데이터가 저장되어 있는 장소
		// 주소값을 Reference : 참조하는 데이터 타입
	}

}