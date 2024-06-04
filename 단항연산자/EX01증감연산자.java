package 단항연산자;

public class EX01증감연산자 {

	public static void main(String[] args) {
		
		// ++,--(앞/뒤)
		// num == >> num = num +1 >> num+= 1
		int num = 3;
		
		System.out.println(num++); //3
		//증감연산자가 뒤에 붙어 있으면 실행코드가 동작 후 연산을 진행한다.
		
		// 현재 4로 저장된 상태이다.
		
		// 증감연산자가 앞에 붙어있으면 연산이 진행된 다음 실행코드가 동작한다.
		System.out.println(--num); //3
		
	}

}
