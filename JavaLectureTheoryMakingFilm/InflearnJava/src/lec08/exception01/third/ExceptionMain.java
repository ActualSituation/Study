package lec08.exception01.third;

public class ExceptionMain {
	
	public void showMsg() throws Exception {
		
		System.out.println("�ȳ��ϼ���.");
		int divide = 10 / 0;
		
	}
	
	public static void main(String[] args) {
		
		try { 
			
			ExceptionMain exceptionMain = new ExceptionMain();
			exceptionMain.showMsg();
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
