package �޼���;

public class EX06�޼���ǽ� {

	public static void main(String[] args) {
		
		int num1= 5;
		int num2= 0;
		char op = '%'; // -, +,*,/
		
		System.out.println(cal(num1,num2,op));
		//op�� -�� ������ num1�� num2�� ���⸦ �� �����
		
	
	}
		//cal �޼��带 ������!
		//op�� ���� �����ִ� ������� �޶�� �Ѵ�.
	public static int cal(int num1, int num2, char op) {
		//�������� �Ű������� �̸��� ���� �̸��� �ִ���
		//���߿� � �����͸� ����ϴ��� �����ϱ� ���Ͽ�
		
		int result =0;
		
		if(op=='-') {
			//return num1-num2;
			result = num1-num2;
		}else if(op=='+') {
			result = num1+num2;
			//return num1-num2;
		}else if(op=='*') {
			result = num1*num2;
			//return num1-num2;
		}else if(op=='/') {
			result = num1/num2;
			//return num1-num2;			
		}
		// 1) else������ �ݾ��ִ� �۾�
		// 2) ��� ��쿡 ���� ���ư��� ������� ���� �� �ֵ��� �����
		return result;
	}
}


/*
if(op=='-') {
	return (num1-num2);
}else if(op=='+') {
	return (num1+num2);
}else if(op=='*') {
	return (num1*num2);
}else if(op=='/') {
	if(num2!=0) {
	return (num1/num2);
	}else {
		System.out.println("0���� �������");
	}
	
}
return op;
*/