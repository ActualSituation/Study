package lec08.exception01.sixth;

public class ExceptionMain {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("����Ͻ� ������ �����մϴ�.");
			
			int divide1 = 10 / 2;
			System.out.println("ù��° ������ : " + divide1);
			
			int divide2 = 10 / 0;
			System.out.println("�ι�° ������ : " + divide2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�������� ���� ������ �����մϴ�.");
		}
		
	}

}
