package 학생정보관리프로그램;

public class StudentDTO {

	// DTO 
	// Student 테이블에 있는 컬럼만큼 필드, getter가 만들어져 있어야합니다.
	// name, age, gender, major
	
	private String name;
	private int age;
	private String gender;
	private String major;
	
	public StudentDTO(String name, int age, String gender, String major) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.major = major;
	}
	
	public StudentDTO(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}
	

	public StudentDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getMajor() {
		return major;
	}


}
