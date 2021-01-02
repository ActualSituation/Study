package lec06.interface03.first;

public interface SampleInterface {
	
	public void interfaceMethod();
	
	public abstract void abstractMethod();
	
	public String OS_NAME = "windows10";
	public final static String DOWNLOAD_PATH = "C:/";
	
	public class sampleFirst  {
		public int sampleCount = 3;
	}
	
	public static class sampleStaticClass {
		public static int staticSampleCount = 1;
	}
	
	public interface innerInterface {
		public void showMsg();
	}
	
	public enum D {CREATE, READ, UPDATE, DELETE}
	
	public default void defaultMethod() {
		System.out.println("�⺻ �޼ҵ��Դϴ�. �ڹ� 1.8 ���ĺ��� ��� �����մϴ�.");
	}
	
	public static void staticVoidMethod() {
		System.out.println("static �޼��嵵 ����� �����մϴ�. �� ���� 1.8���� ����� �����մϴ�.");
	}
	
	// �� �Ʒ�����
	private void privateMethod() {
		System.out.println("interface ������ private �޼����Դϴ�. �ڹ� 11 ���� ���ĺ��� ����� �����մϴ�.");
	}
	
	default void callPrivateMethodInmDefaultMethod() {
		privateMethod();
	}

}
