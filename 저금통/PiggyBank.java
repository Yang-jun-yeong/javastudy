package 저금통;

public class PiggyBank {

	// 저금통 설계도
	// 1) 필드 - 금액(money)
	private int money;
	private String name;
	
	// 클래스 외부에서 접근 할 수 없도록 
	// 단, 클래스 내부에 설계되어있는 메서드를
	// 통해서 접근이 가능하다
	
	// 생성자
	// - 객체 생성 (기본)
	// - 필드를 초기화 (만들어줘야하는 것)
	
	public PiggyBank() {
		// 기본 생성자
	}
	
	public PiggyBank(int money, String name) {
		this.money = money;		
		this.name = name;
	}
	
	// 1. 생성자도 메서드다
	// 2. 생성자의 이름은 설계도(클래스)의 이름과 같다
	// 3. 기본생성자는 생략되어잇다
	// 4. 내가 새로운생성자를 만들면 기본생성자는 사용을 못한다
	// 5. 기본 생성자도 사용하고 싶고, 필드를 초기화 시키는
	// 것도 사용하고 싶으면 오버로딩 해주면 됩니다
	// 오버로딩 : 
	// 6. 리턴타입이 없다(void도 안온다!)
	
	
	
	
	// getter/setter
	// getter - 필드를 가져와주는 역할 
	public int getMoney(){
		return money;
	}
	// setter - 필드를 수정하는 역할
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 2) 메서드 - 입금, 출금, 잔액
	public void withdraw(int money) {
		// 돈을 인출
		this.money -= money;
	}
	public void deposit(int money) {
		// 돈을 입금
		// this : 현재 클래스를 지칭 키워드
		this.money = this.money + money;
	}
	public void showMoney() {
		// 현재 내가 가지고있는 금액을 보여주는 기능
		System.out.println(money+"원");
	}
	
}
