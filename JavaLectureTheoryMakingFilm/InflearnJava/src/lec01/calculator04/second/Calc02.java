package lec01.calculator04.second;

public class Calc02 {
	
	public static void main(String[] args) {
		
		int intVar1 = 10;
		int intVar2 = 2;
		intVar1 += intVar2;
		System.out.println("intVar1 : " + intVar1);
	
		intVar1 = 10;
		intVar2 = 2;
		intVar1 = intVar1 + intVar2;
		System.out.println("intVar1 : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 -= intVar2;
		System.out.println("���� : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 *= intVar2;
		System.out.println("���ϱ� : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 2;
		intVar1 = intVar1 * intVar2;
		System.out.println("���ϱ� Ǯ��� : " + intVar1);
		
		intVar1 = 10;
		intVar2 = 3;
		intVar1 %= intVar2;
		System.out.println("������ ���� ������ : " + intVar1);
		
	}

}
