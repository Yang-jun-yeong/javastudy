package �������迭;

public class EX03�迭 {

	public static void main(String[] args) {
		int arr [] = {23,45,95,17,6,89,47,56,68,71};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<=arr.length-1; i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		
		// - {} scope(����)
		// - �������� : Ư�� ���������� ����� �� �ֵ��� ���� �� �ʱ�ȭ
		// - �������� 
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּڰ� : "+ min);
	}

}
