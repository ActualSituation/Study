package lec02.whilelecture;

public class DoWhile01 {
	
	public static void main(String[] args) {
		
		int intTest = 0;
		do {
			System.out.println("�ε��� : " + intTest);
			intTest++;
		} while (intTest < 5);
		
		intTest = 0;
		System.out.println("=============================================");
		
		do {
			System.out.println("�ε��� : " + intTest);
			intTest++;
		} while (intTest < 0);
		
		System.out.println("=============================================");
		
		do {
			System.out.println("������ �� ���� �����մϴ�.");
		} while (false);
		
	}

}
