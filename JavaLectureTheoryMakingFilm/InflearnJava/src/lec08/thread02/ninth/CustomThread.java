package lec08.thread02.ninth;

public class CustomThread extends Thread {
	
	public boolean available = true;
	public boolean stop = false;
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		System.out.println(name + " �����մϴ�.");
		int count = 0;
		
		while (stop == false) {
			count++;
			if (available == false) {
				Thread.yield();
			}
			
			if (stop == true) {
				break;
			}
			System.out.println(name + " while��");
		}
		
		if (stop == true) {
			System.out.println(name + " ::: " + count);
		}
		
		System.out.println(name + " �����մϴ�.");
	}
	
}
