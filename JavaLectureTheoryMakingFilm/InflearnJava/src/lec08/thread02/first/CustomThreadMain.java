package lec08.thread02.first;

public class CustomThreadMain {
	
	public static void main(String[] args) {
		
		System.out.println("�����Լ� ����");
		
		Thread thread1 = new CustomThread("ù��° ������", 750);
		Thread thread2 = new CustomThread("�ι�° ������", 1500);
		
		CustomRunnable cr1 = new CustomRunnable("����° ������ runnable", 2250);
		CustomRunnable cr2 = new CustomRunnable("�׹�° ������ runnable", 3000);
		
		Thread thread3 = new Thread(cr1);
		Thread thread4 = new Thread(cr2);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("�����Լ� ����");
		
	}

}
