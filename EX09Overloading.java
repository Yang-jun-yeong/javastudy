package �޼���;

public class EX09Overloading {

	public static void main(String[] args) {
		//�ѱ��� �̸��� �����ͺ��̽��� �����ϴ� �޼���:
		//stName(��,�̸�)
		stName("��Ƽ��","��","�⽺");
		stName("��","�ؿ�");
		
		//���� ����� �ϴ� �޼������ ���� �ٸ� �̸��� ������ ������
		//������ ���忡�� ���ŷӰ� �����ϴ�.
		//�ڵ��� ���̰� �پ���. if������ �̻���� �̱�������, �ѱ�������
		//������ �ʿ䰡 �������� �����̴�.
		
		//�����ε�(�ߺ�����)
		//���� Ŭ���� ������ ���� �̸��� �޼��带 ������ �� �ִ�.
		//��, �Ű������� ���°� �޶���Ѵ�.(������ Ÿ��, �Ű������� ����, ����)
	
	}
	public static void stName(int firstName, String lastName) {
		
		//������ Ÿ�Ը� �ٲ� ��
		
	}
	public static void stName(String lastName, int firstName ) {
		
		//������ �ٲ� ��
		
	}
	public static void stName(String firstName, String lastName) {
		//�ڵ�.. �����ͺ��̽��� �̸��� ����...
	}
	public static void stName(String firstName, String middleName, String lastName) {
		//�ڵ�.. �����ͺ��̽��� �̸��� ����..
	}
}
