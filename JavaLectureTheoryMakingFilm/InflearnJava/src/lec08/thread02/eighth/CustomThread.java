package lec08.thread02.eighth;

public class CustomThread extends Thread {
	
	boolean suspend = false;
	boolean stop = false;
	
	public void thSuspend() {
		suspend = true;
	}
	
	public void thResume() {
		suspend = false;
	}
	
	public void thStop() {
		stop = true;
	}
	
	public void run() {
		int count = 0;
		while (stop == false) {
			System.out.println("thread�� ���� ���Դϴ�.");
			try {
				Thread.sleep(1000);
				if (suspend == false) {
					System.out.println(count + " : �����尡 ���� ���� ���� ���Դϴ�.");
				}
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
