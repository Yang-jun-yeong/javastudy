package �������迭;

public class EX01�迭���� {

	public static void main(String[] args) {
		
		//�迭�� �ʿ伺
		String b1 = "���ؿ�";
		String b2 = "�����";
		String b3 = "����ȣ";
		String b4 = "��â��";
		String b5 = "���ڿ�";
		//5���� �л��̸��� for������ ����ϸ� ����� �� ���� ������?
		
		//������ ����°� ���� �ٸ� ������ 5�� ����°�!(���������)
		//�׷��� for���� Ȱ���� �������� ������ �Ұ����ϰ� �������
		
		//�̸��� �����ϴ� �迭�� ���������
		//1) �迭�� �����ϴ� ���
		// �ڷ���[] �迭�� = new �ڷ��� [�迭��ũ��];
		// �ڷ��� : ���� �迭�� �����ϰ� ���� �����͵��� Ÿ��
		//[] --> �迭�� �ǹ�
		// new --> ���� �޸𸮸� ���Ӱ� �Ҵ� ���ִ� Ű����
		// �迭�� ������ ���� ���ʿ��� �ݵ�� ũ�⸦ ������� �Ѵ�.
		
		String [] names = new String [5];
		// - �迭�� �ε��� ������ ������ �ִ�.
		// names : ���۷����� ����(�ּҰ��� �����ϴ� ����)
		int [] nums = new int[8];
		
		// �⺻ ������ Ÿ���� ����Ǵ� ��� (boolean, int, double, char..)
		// ���۷����� ������ Ÿ���� ����Ǵ� ��� (String, �迭)
		names[1] = b1;
		names[2] = b2;
		names[3] = b3;
		names[4] = b4;
		names[0] = b5;
		
		// ArraryIndexOutofBoundsException : ���ܻ�Ȳ
		//- ������ ���Ѿ� �� �� �ִ� ����
		// - �ε��� ���� �ʰ� / ���� �ε��� ���� �����ϸ� �߻��ϴ� ��Ȳ
		
		// index �⺻������ 0���� �����Ѵ�.
		// names�� ���� �� �ִ� �ε��� ���� 0~4
		
		
		// �ε����� ������ ���/for���� ����ؼ� names�迭��
		// ����Ǿ��ִ� �̸� 5���� ����غ���
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		// �л����� �����Ѵ�.
		//names[5] = "�����";
		// �տ��� �迭�� ������ �� ���س��� ũ�⸦ �ڿ��� �ٲ� �� ����.
		
		System.out.println(names.length); 
		 
		//�ǽ�) �迭�� ������ �� 8���� �ʱ�ȭ�� �غ���
		// 7, 11, 20 ,30 ,5 ,45 ,17 ,9
		int num1 = 7;
		int num2 = 11;
		int num3 = 20;
		int num4 = 30;
		int num5 = 5;
		int num6 = 45;
		int num7 = 17;
		int num8 = 9;
		
		nums[0] = num1;
		nums[1] = num2;
		nums[2] = num3;
		nums[3] = num4;
		nums[4] = num5;
		nums[5] = num6;
		nums[6] = num7;
		nums[7] = num8;
		
		
		// �迭�ȿ��� Ȧ���� ����غ���
		
		for(int j=0; j<nums.length;j++) {
		if(nums[j]%2==1) {
			System.out.println(nums[j] + " ");
		}
		
		}
		int cnt=0;
		// �迭�ȿ� ¦���� ������ ����غ���
		for(int k=0; k<nums.length; k++) {
			if(nums[k]%2==0) {
				cnt++;
			}
			
		}
		System.out.println("¦���� ���� : "+cnt+"��");
		
		// �迭 �ȿ� ���ڵ� �� ���� ū ���� ����� ����
		int max = nums[0];
		//�迭�� �� ������ �ʱ�ȭ �Ǿ��ִٸ� 0�̶�� ���� �ִ밪�� �Ǿ������.
		//�񱳸� �ϱ� ���ؼ��� �迭�ȿ� �ִ� ���� �����ͷθ� ����� �� �ֵ���
		
		for(int p=0; p<nums.length; p++) {
			if(max<nums[p]) {
				max=nums[p];
			}
		}
		System.out.println("�ִ밪�� " + max);
		}
		
	}