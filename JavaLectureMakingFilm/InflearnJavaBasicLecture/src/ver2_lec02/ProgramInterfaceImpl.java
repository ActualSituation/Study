package ver2_lec02;

public class ProgramInterfaceImpl implements ProgramInterface {

	@Override
	public void start() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���α׷��� ����ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	@Override
	public void shutdown() {
		System.out.println("���α׷� ������ ����ϴ�.");
	}
	
}
