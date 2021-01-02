package lec08.exception01.fourth;

public class ExceptionMain {
	
	public void divideMath(int parameter) throws ArithmeticException {
		
		if (parameter > 12) {
			System.out.println("1�⿡�� 12������ �ִ�ġ�Դϴ�.");
			throw new ArithmeticException();
		} else {
			System.out.println("���� 3���� ��� ������ ������ ����մϴ�.");
			int calculateValue = 300000000 / parameter;
			System.out.println("���� : " + calculateValue);
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			ExceptionMain exceptionMain = new ExceptionMain();
			exceptionMain.divideMath(13);
			
		} catch (ArithmeticException ae) {
			System.out.println("��� ���ܰ� �߻��Ͽ����ϴ�.");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
		
	}

}
