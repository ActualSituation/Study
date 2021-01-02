package lec08.thread02.eighth;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("������ �ǽ��� �����մϴ�.");
			System.out.println();
			
			CustomThread customThread = new CustomThread();
			customThread.start();
			
			Thread thread = new Thread() {
				public void run() {
					System.out.println("���� �����带 �����մϴ�.");
					try {
						Thread.sleep(3500);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
					
					System.out.println("�� �����带 ����ϴ�.");
					customThread.thSuspend();
					
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("�� �����带 ������մϴ�.");
					customThread.thResume();
					
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("�� �����带 ����ϴ�.");
					customThread.thStop();
				}
			};
			
			thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
 