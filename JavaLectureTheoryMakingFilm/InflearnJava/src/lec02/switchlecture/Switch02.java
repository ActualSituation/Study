package lec02.switchlecture;

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��մϴ�. : ");
		String strGetScore = scanner.next();
		
		int intGetScore = Integer.parseInt(strGetScore);
		
		switch (intGetScore) {
			case 90 :
			case 80 :
			case 70 :
				System.out.println("���� ����Դϴ�.");
				break;
			case 60 :
			case 50 :
				System.out.println("��ȣ�� ����Դϴ�.");
				break;
			case 40 :
			case 30 :
			case 20 : 
			case 10 :
				System.out.println("���� ����Դϴ�.");
				break;
		}
		
	}

}
