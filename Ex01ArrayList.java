package ArrayList����;

import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {
		
		// �����迭 ArrayList
		// �������� ������ ���� ũ�Ⱑ �þ�/�پ����� �� �� �ִ� �迭
		
		// 1) �����迭�� ���� �� ����
		ArrayList<String> list = new ArrayList<>();
		
		// 2) �����͸� �߰��ϴ� ��� 
		// -add(String str)
		list.add("���ڿ�");
		list.add("�ֿ�ȭ");
		list.add("�ں���");
		//-add(int index, String str)
		list.add(1,"�̵���");
		
		//3) �����͸� Ȯ���ϴ� ���(�������� ���)
		// - get(int index)
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//get�� ����ִ� index���� ������ ���� �� �ִ�
		//��, �������� ������ �����ϴ�!
		
		// list.size() : ArrayList�� ũ�� ���� ����� �����ִ� �޼���
		
		for(int i =0; i< list.size();i++) {
			// i : 0 1 2 3 
			System.out.println(list.get(i));
		}
		
		// 4)�����͸� �����ϴ� ���
		// remove(int index) - �����ϰ� ���� �������� ��ġ(�ε���)
		list.remove(0);
		// 0 - �̵��� 1 - �ֿ�ȭ2 �ں���
		System.out.println(list.get(0));
		
		// 5) ��� �����͸� �����ϴ� ���
		// - clear()
		list.clear();
		
		System.out.println(list.size());
		
		ArrayList<Integer> numbers = new ArrayList<>();
		//ArrayList�� ���۷����� ������ Ÿ�Ը� ������ �� �ִ�.
		//int, char, boolean - �⺻������Ÿ��
		
		//int - integer
		//float -Float
		
		//<> - generic - Collection
		// ��ü �ڷ����� ������ �� �ִ� �ڷ� ����
		
		numbers.add(5);
		
		
		
	} 

}
