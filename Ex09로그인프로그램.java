package �������迭;

import java.util.Scanner;

public class Ex09�α������α׷� {

   public static void main(String[] args) {

	   // 1) �Է��ϴ� ��� ��������
	      Scanner sc = new Scanner(System.in);
	      
	      // id, pw �迭�� ���� �� ����
	      String[] id_array = new String[3];
	      int[] pw_array = new int[3];
	      
	      // �ε��� ��
	      int index = 0;
	      
	      // 2) while�� ����ؼ� ��������� �޴� ���� �ޱ�
	      while(true) {
	         // �������� : ����ڰ� 3�� �Է����� ��
	         System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
	         int select = sc.nextInt();
	         
	         if(select == 1) {
	            // ȸ������
	            if(index == 3) {
	               System.out.println("ȸ�������� ������ �� �����ϴ�.");
	               continue;
	            }
	            System.out.println("== ȸ������ ==");
	            // 1) id,pw�� ����� �� �ִ� �迭�� ������
	            // �迭�� �������ϴ� ��ġ�� ���Ⱑ ������?�� ����غ�����
	            // -> while���� ����ɶ����� �ٽ� �ʱ�ȭ ���� �ʵ��� �ϱ����� �ٱ�
	            
	            // 2) ����ڰ� �Է��� id,pw�� ������ �ε�������
	            // ����� �� �ֵ��� ������
	            System.out.print("���̵� �Է� : ");
	            String id = sc.next();
	            System.out.print("��й�ȣ �Է� : ");
	            int pw = sc.nextInt();
	            
	            // - �ٵ� while�������� �ε��������� ����� �� �ִ�
	            // ������ ����... �ʿ��ϸ� �����ƿ�
	            
	            id_array[index] = id;
	            pw_array[index] = pw;
	            
	            index++;
	            // ���� ȸ�������� �����ϴ� ����ڴ� +1 ������
	            // �ε������� �����͸� ������ �� �ֵ���
	            
	            // �ƹ����� ũ�Ⱑ 3���� ������������...
	            // 3���� �ʰ��ϴ� �����ڰ� �߻��ϸ� �ȵ˴ϴ�!
	            // ���� �ʰ��Ϸ��� ���� ���� ?
	            // + "�� �̻� ������ �� �����ϴ�." ������ �����ֱ�
	            
	      
	         }else if(select == 2) {
	            boolean isSuccessful = false;
	            
	            // �α���
	            System.out.println("== �α��� ==");
	            
	            // 1) ����ڷ� ���� id,pw�� �Է¹ޱ�
	            System.out.print("���̵� �Է� : ");
	            String id = sc.next();
	            System.out.print("��й�ȣ �Է� : ");
	            int pw = sc.nextInt();
	            // 2) ����ڰ� �Է��� id�� pw�� �迭�� ����ִ���
	            // Ȯ���ϱ� 
	            // ��, �α��� ������ ������...
	            // id�� pw�� ��ġ�ؾ��Ѵ�... \
	            for(int i = 0; i < id_array.length; i++) {
	               if(id_array[i].equals(id) && pw_array[i]==pw) {
	                  isSuccessful = true;
	                  // 
	               }
	            }
	            
	            
	            if(isSuccessful == true) {
	               System.out.println("�α��� ����");
	            }else {
	               System.out.println("�α��� ����");
	            }
	            
	            
	            // id[0] - smhrd, id[1] - cjy
	            // pw[0] - 1234,  pw[1] - 0000
	            // �� ���ִٰ� �������� ��
	            // smhrd, 1234�� �α��� �����ε�
	            // smhrd, 0000�� �α��� �����Դϴ�!
	            
	            // ȸ�������� 3�� �Ϸᰡ �Ǿ��־�� ������ ����
	            // NullPointerException...... 
	            
	            // ������ ������ ���θ� �� ���ִ� � ����....?
	            
	            
	         }else {
	            System.out.println("���α׷��� ����Ǿ����ϴ�.");
	            break; // while���� ���������� Ű����
	         }
	         
	         
	      }
	      
	      
	      
	   }

	}
