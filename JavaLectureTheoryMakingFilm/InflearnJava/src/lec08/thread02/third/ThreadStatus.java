package lec08.thread02.third;

public class ThreadStatus {
	
	public static void showThreadStatus() {
		
		Thread thread = Thread.currentThread();
		
		ThreadGroup threadGroup = thread.getThreadGroup();
		String threadGroupName = threadGroup.getName();
		int threadGroupIntActiveGroupCount = threadGroup.activeGroupCount();
		int threadGroupIntActiveCount = threadGroup.activeCount();
		
		String threadName = thread.getName();
		int threadPriority = thread.getPriority();
		Thread.State threadState = thread.getState();
		
		System.out.println("������׷�� : " + threadGroupName);
		System.out.println("������׷��Ƽ��׷찳�� : " + threadGroupIntActiveGroupCount);
		System.out.println("������׷��Ƽ�갳�� : " + threadGroupIntActiveCount);
		System.out.println("������� : " + threadName);
		System.out.println("������켱���� : " + threadPriority);
		System.out.println("�����彺�� : " + threadState);
		
	}
	
	public static void main(String[] args) {
		
		ThreadGroup threadGroup = new ThreadGroup("������׷�");
		
		Thread firstThread = new Thread(threadGroup, "ù��° ������") {
			public void run() {
				try {
					Thread.sleep(1500);
					showThreadStatus();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		showThreadStatus();
		firstThread.start();
		
	}

}
