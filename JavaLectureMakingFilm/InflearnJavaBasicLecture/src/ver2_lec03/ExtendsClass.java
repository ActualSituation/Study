package ver2_lec03;

public class ExtendsClass extends AbstractClass {

	@Override
	public void methodFirst() {
		System.out.println("��ӹ��� Ŭ������ �������̵�� methodFirst.");
	}

	@Override
	public void methodSecond() {
		System.out.println("��ӹ��� Ŭ�������� �ణ�� ������ �� ���ϴ�.");
		super.methodSecond();
	}

	@Override
	public int methodThird() {
		int getData = super.methodThird();
		int addMoreValue = 12;
		return getData + addMoreValue;
	}
	
}
