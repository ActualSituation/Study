package lec08.thread02.twelfth;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {
	
	public static void main(String[] args){ 
		
		List<Integer> intList = new ArrayList<Integer>();
		
		Thread thread1 = new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(3000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					
					synchronized (intList) {
						System.out.println("������1 wait");
						try {
							intList.wait();
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
					
					System.out.println("thread1 ����.");
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(3000);
					} catch(Exception e) {
						e.printStackTrace();
					}
					
					synchronized (intList) {
						System.out.println("������2 wait.");
						try {
							intList.wait();
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("thread2 ����.");
				}
			}
		};
		
		Thread thread3 = new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(8000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					synchronized (intList) {
						System.out.println("������3 notify");
						//intList.notify();
						intList.notifyAll();
					}
				}
			}
		};
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
