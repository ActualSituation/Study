package lec02.iflecture;

public class If02 {
	
	public static void main(String[] args) {
		
		//int cashAmount = 10000;
		//int cashAmount = 7000;
		//int cashAmount = 3000;
		int cashAmount = 2000;
		int afterAmount = 0;
		String strMsg1 = "�ܱ��� 3õ�� �̸��Դϴ�. ������ �����մϴ�.";
		String strMsg2 = "�ܱ��� 5õ�� �ʰ��Դϴ�. ���� ���¸� �����մϴ�.";
		String strMsg3 = "�ܱ��� 9õ�� �ʰ��Դϴ�. �ʰ����� �Ա��մϴ�.";
		
		if (cashAmount > 9000) {
			System.out.println(strMsg3);
			afterAmount = cashAmount - (cashAmount - 9000); 
		} else if (cashAmount > 5000) {
			System.out.println(strMsg2);
			afterAmount = cashAmount;
		} else if (cashAmount < 3000) {
			System.out.println(strMsg1);
			afterAmount = 9000;
		} else {
			afterAmount = cashAmount;
		}
		
		System.out.println("�ܱ��Դϴ�. : " + afterAmount);
		
	}

}
