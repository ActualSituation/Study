package lec02.iflecture;

public class If03 {
	
	public static void main(String[] args) {
		
		//int workScore = 95;
		//int workScore = 80;
		int workScore = 75;
		//int relationScore = 95;
		//int relationScore = 90;
		int relationScore = 75;
		boolean thisYearPromotionTarget = true;
		
		int totalScore = (workScore + relationScore) / 2;
		System.out.println("�� ������ : " + totalScore);
		
		String employeeGrade = String.valueOf("S");
		String employeeSalaryGrade = String.valueOf("��");
		
		if (totalScore >= 90) {
			System.out.println("S��� �����Դϴ�.");
			employeeGrade = String.valueOf("S");
			employeeSalaryGrade = String.valueOf("��");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("���� ����Դϴ�.\n�� ��� S���Դϴ�.\n���� ���� ����Դϴ�.");
			} else {
				System.out.println("���� ����� �ƴմϴ�.\n�� ��� S���Դϴ�.\n���� �λ�� '��'���Դϴ�.");
			}
		} else if (totalScore >= 80) {
			System.out.println("A��� �����Դϴ�.");
			employeeGrade = String.valueOf("A");
			employeeSalaryGrade = String.valueOf("��");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("���� ����Դϴ�.\n�� ��� A���Դϴ�.\n�켱 ���� ����Դϴ�.");
			} else {
				System.out.println("���� ����Դϴ�.\n�� ��� A���Դϴ�.\n���� �λ�� '��'���Դϴ�.");
			}
		} else if (totalScore >= 70) {
			System.out.println("B��� �����Դϴ�.");
			employeeGrade = String.valueOf("B");
			employeeSalaryGrade = String.valueOf("��");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("���� ����Դϴ�.\n�� ��� B���Դϴ�.\n���� ����Դϴ�.");
			} else {
				System.out.println("���� ����� �ƴմϴ�.\n�� ��� B���Դϴ�.\n���� �λ�� '��'���Դϴ�.");
			}
		} else if (totalScore >= 60) {
			System.out.println("C��� �����Դϴ�.");
			employeeGrade = String.valueOf("C");
			employeeSalaryGrade = String.valueOf("��");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("���� ����Դϴ�.\n�� ��� C���Դϴ�.\n���� ��� ����Դϴ�.");
			} else {
				System.out.println("���� ����� �ƴմϴ�.\n�� ��� C���Դϴ�.\n���� �λ�� '��'���Դϴ�.");
			}
		} else {
			System.out.println("D��� �����Դϴ�.");
			employeeGrade = String.valueOf("D");
			employeeSalaryGrade = String.valueOf("��");
			
			if (thisYearPromotionTarget == true) {
				System.out.println("���� ����Դϴ�.\n�� ��� D���Դϴ�.\n���� ���� ����Դϴ�.");
			} else {
				System.out.println("���� ����� �ƴմϴ�.\n�� ��� D���Դϴ�.\n���� �λ�� '��'���Դϴ�.");	
			}
		}
		
		if (employeeGrade.equals("S")) {
			System.out.println("[����]�� �����߽��ϴ�. Ư�� ������ �ǽ��մϴ�.");
		} else if (employeeGrade.equals("A")) {
			System.out.println("[����]�� �����߽��ϴ�. �߰� ������ �ǽ��մϴ�.");
		} else if (employeeGrade.equals("B")) {
			System.out.println("[����]�� ���� �� ���� ���򰡸� �����մϴ�.");
		} else if (employeeGrade.equals("C")) {
			System.out.println("[����]�� �����մϴ�.");
		} else if (employeeGrade.equals("D")) {
			System.out.println("[����]�� �������� �ʽ��ϴ�. [���]�� �����մϴ�.");
		} else {
			System.out.println("[����]�� �������� �ʽ��ϴ�. [��� ��]�Դϴ�.");
		}
		
		if (employeeSalaryGrade.equals("��")) {
			System.out.println("�����λ� [��]���� �����մϴ�.");
		} else if (employeeSalaryGrade.equals("��")) {
			System.out.println("�����λ� [��]���� �����մϴ�.");
		} else if (employeeSalaryGrade.equals("��")) {
			System.out.println("�����λ� [��]���� �����մϴ�.");
		} else if (employeeSalaryGrade.equals("��")) {
			System.out.println("�����λ� [��]���� �����մϴ�.");
		} else if (employeeSalaryGrade.equals("��")) {
			System.out.println("�����λ� [��]���� �����մϴ�.");
		} else {
			System.out.println("�����λ� [��� ��]���� �����մϴ�.");
		}
		
	}

}
