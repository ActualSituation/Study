package ver2_lec05.exception01;

public class TryCatchFinally02 {
	
	public static void main(String[] args) {
		
		/*
		try {
			System.out.println("try-catch-finally ������ ����Ǿ����ϴ�.");
			
			int allSum = 10 / 0;
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		} finally {
			System.out.println("try-catch-finally ������ ����Ǿ����ϴ�.");
		}
		*/
		
		try {
			System.out.println("���� �����Դϴ�.");
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ��׿�.");
		} finally {
			System.out.println("������ ��ġ�Դϴ�.");
		}
		
		
	}

}