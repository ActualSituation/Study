package ver2_lec03;

public abstract class AbstractClass {
	
	public abstract void methodFirst();
	
	public void methodSecond() {
		System.out.println("�߻� Ŭ���� methodSecond");
		methodFirst();
	}
	
	public int methodThird() {
		return 10 + 2;
	}

}
