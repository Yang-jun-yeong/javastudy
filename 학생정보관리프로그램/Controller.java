package 학생정보관리프로그램;

public class Controller {
	StudentDAO dao = new StudentDAO();

	// 학생등록을 진행하는 기능 - view에서 입력한 등록할 데이터를 받아주는 역할
	public void insert(StudentDTO dto) {
		
		
		int cnt = dao.insert(dto); // cnt
		
		if(cnt > 0) {
			System.out.println("학생 등록 성공");
		}else {
			System.out.println("학생 등록 실패");
		}
		
	}
	
	public void update(StudentDTO dto) {
		int cnt = dao.update(dto);
		if(cnt > 0) {
			System.out.println("학생정보 수정 성공");
		}else {
			System.out.println("학생정보 수정 실패");
		}
	}
	
	
	public void delete(StudentDTO dto) {
		int cnt = dao.delete(dto);
		if(cnt > 0) {
			System.out.println("학생정보 삭제 성공");
		}else {
			System.out.println("학생정보 삭제 실패");
		}
	}
	
}
