package �������迭;

public class EX02�迭 {

	public static void main(String[] args) {
		// �迭�� ������ ������ �ʱ�ȭ
		// 3,7,18,71,9,12,24
		//(1���� ������ �迭 -arr)
		//�迭�� �� �� Ȧ���� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		int arr [] = {3,7,18,71,9,12,24};
		int cnt=0;
		System.out.print("array�� ����ִ� Ȧ���� ");
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]%2==1) {
			cnt++;
			System.out.print(arr[i]+" ");
		}
		}
		System.out.println("�̸�, ");
		System.out.print("�� "+cnt+"�� �Դϴ�.");
		

	}

}
