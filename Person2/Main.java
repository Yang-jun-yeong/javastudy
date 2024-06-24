package Person2;

public class Main {

	public static void main(String[] args) {

		// 1) 
		Person person1 = new Person();
		// 2) 
		person1.setName("홍길동");
		person1.setAge(25);
		// 3) 
		Person person2 = new Person("김영희", 27);
		// 4)
		System.out.println(person1.getName()+","+person1.getAge());
		System.out.println(person2.getName()+","+person2.getAge());
	
		// 객체배열
		// - Person 자료형을 관리하는 배열을 선언 및 생성
		Person[] pArray = new Person[2];
		// 0 ~ 1
		pArray[0] = person1;
		pArray[1] = person2;
		
		System.out.println(pArray[0].getName());
		System.out.println(pArray[1].getName());
		
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].getName());
		}
		
		
		
		
		
	}

}