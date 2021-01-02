package lec08.thread02.fifteenth;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ExecutorService executorServicePool = Executors.newFixedThreadPool(2);
		
		CustomRunnable customRunnable1 = new CustomRunnable("������1");
		CustomRunnable customRunnable2 = new CustomRunnable("������2");
		CustomRunnable customRunnable3 = new CustomRunnable("������3");
		CustomRunnable customRunnable4 = new CustomRunnable("������4");
		
		executorServicePool.execute(customRunnable1);
		executorServicePool.execute(customRunnable2);
		executorServicePool.execute(customRunnable3);
		
		executorServicePool.shutdownNow();
		
		executorServicePool.execute(customRunnable4);
		
		try {
			boolean at = executorServicePool.awaitTermination(3000, TimeUnit.MILLISECONDS);
			System.out.println("��� : " + at);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���� �޼��� ����.");
	}

}
