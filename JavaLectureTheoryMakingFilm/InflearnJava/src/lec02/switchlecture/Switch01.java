package lec02.switchlecture;

import java.util.Scanner;

public class Switch01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����Ϸ��� �ü� ���� ��� : ");
		String strBuildingSecurityGrade = scanner.next();
		
		System.out.println("�ü� ���� ������ ���մϴ�.");
		
		switch (strBuildingSecurityGrade) {
			case "��" :
				System.out.println("�����Դϴ�.\n���� 2��� �̻� �����ڸ� ������ �� �ֽ��ϴ�.");
				break;
			case "��" :
				System.out.println("�����Դϴ�.\n���� 3��� �̻� �����ڸ� ������ �� �ֽ��ϴ�.");
				break;
			case "��" :
				System.out.println("�ٱ��Դϴ�.\n��ܺ��Դϴ�. ������ ������ �� �ֽ��ϴ�.");
				break;
				default:
					System.out.println("���� �����ϴ�.\n��� ���Դϴ�. ���� ������ �����ϴ�.");
					break;
		}
		
	}

}
