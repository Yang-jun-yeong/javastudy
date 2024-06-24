package Person;

public class Person {

	// 설계도에 해당하는 곳
	// Class == 설계도
	// 1) Field(필드) : 데이터, 변수, 속성, 정보
	// 내가 설계하고자 하는 Object가 가질 수 있는 데이터
	//                (Person)
	
	// 사람이 가질 수 있는 데이터(변수)?
	// - 나이
	int age;
	// - 성별
	String gender;
	// - 이름
	String name;
	// 필드를 만들 때는 선언만 해준다...
	// 이름을 "조자연"으로 설계도에 만들어놓으면 이 설계도를 통해
	// 만들어지는 모든 사람들은 이름이 "조자연"
	
	// 2) Method(메서드) : Object의 행위/행동, 기능
	// 사람이 할 수 있는 행위/행동?
	
	// - 숨쉬기
	public void breathe() {
		System.out.println("숨을 쉰다 ㅇ3ㅇ ~ ");
	}
	// - 밥먹기
	public void eat() {
		System.out.println("밥을 먹는다 :q ~");
	}
	// - 잠자기
	public void sleep() {
		System.out.println("잠을 잔다 ㅡ_ㅡzz");
	}
	
	
	
}
