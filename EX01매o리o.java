package �޼���;

public class EX01��o��o {

	public static void main(String[] args) {
		//�Ű����� �ְ�, ����Ÿ��(������ Ÿ���� ���)�� �ִ� �޼���
		
		minus(10,5);
		System.out.println(minus(10,5));

	}// main �� - �޼��� ����

	// 1) public : ������
	//  Ŭ���� ��/�ܺο��� �����ο� ������ �� �� �ֵ��� �����ִ� ������
	// (private,protected,default)
	// 2) static : �����
	// �޸� ������ ������ �۱� ������ �Ժη� ������� �� ��!
	// 3) int : ����Ÿ��
	// ���� �޼��带 ������� �� �����޴� ������� ���� ������ Ÿ��
	// 4) �޼����(ȣ���)
	// 5) �Ű�����
	// - ����
	// - �Ű����� �̸��� ������ �� �ִ� �̸����� �����ָ� �ȴ�.
	public static int minus(int num1, int num2) {
		//{} (body) == �޼��� ����
//		int result = num1-num2;
//		return result;
		return num1-num2;
		// return : ����Ÿ�Կ� ������ Ÿ���� ��õǾ� ������
		// �ݵ�� �޼��� �����ȿ� Ű���尡 ���ԵǾ��־���Ѵ�!
	}
	
	
}
