package lec03.example;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example01 {
	
	public static StringBuilder sbProcureNo = new StringBuilder("");
	public static StringBuilder sbProcureItem = new StringBuilder("");
	public static StringBuilder sbProcureQty = new StringBuilder("");
	public static StringBuilder sbProcurePrice = new StringBuilder("");
	
	public static StringBuilder sbOrderRequestNo = new StringBuilder("");
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Žý��ۿ� �����ϼ̽��ϴ�.");
		System.out.print("���ſ�û�� �����Ͻðڽ��ϱ�?(Y/N) : ");
		String strProcureGo = scanner.next();
		
		boolean isProcureGo = false;
		
		while (strProcureGo.equals("Y")) {
			
			System.out.println("���Žý��ۿ� �����ϼ̽��ϴ�.");
			System.out.println("���ſ�û�� �����մϴ�.");
			
			Date today = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
			StringBuilder strToday = new StringBuilder(sdf1.format(today));
			
			System.out.println("���� ��¥�� : " + strToday.toString());
			
			System.out.println("���ſ�û��ȣ�� �����մϴ�.");
			
			strToday.append("001");
			
			System.out.println("���ſ�û��ȣ�� �����Ǿ����ϴ�.");
			System.out.println("���ſ�û��ȣ�� ===> " + strToday.toString());
			
			sbProcureNo.append(strToday.toString());
			
			System.out.print("����ǰ���� �Է��� �ּ��� : ");
			String procureItem = scanner.next();
			sbProcureItem.append(procureItem.toString());
			
			System.out.print("���ż����� �Է��� �ּ��� : ");
			String procureQty = scanner.next();
			sbProcureQty.append(procureQty.toString());
			
			System.out.print("���Ű����� �Է��� �ּ��� : ");
			String procurePrice = scanner.next();
			sbProcurePrice.append(procurePrice);
			
			System.out.println("���� �����Դϴ�.");
			System.out.println("���ſ�û��ȣ : " + sbProcureNo.toString());
			System.out.println("����ǰ�� : " + sbProcureItem.toString());
			System.out.println("���ż��� : " + sbProcureQty.toString());
			System.out.println("���Ű��� : " + sbProcurePrice.toString());
			
			System.out.println("\n\n\n");
			
			System.out.print("���ֿ�û�� �����Ͻðڽ��ϱ�?(Y/N)");
			String strOrderRequestGo = scanner.next();
			
			if (strOrderRequestGo.equals("Y")) {
				sbOrderRequestNo.append(strToday.toString());
				System.out.println("���ֿ�û�� �����մϴ�.");
				System.out.println("���ֿ�û��ȣ�� " + sbOrderRequestNo.toString() + "�Դϴ�.");
				
				System.out.println("��û�Ͻ� ���ſ�û���� ���ֿ�û�� �����Ͽ����ϴ�.");
			}
			
			System.out.print("���ſ�û�� �����Ͻðڽ��ϱ�?(Y/N) : ");
			
			String getProcureIsGo = scanner.next();
			strProcureGo = getProcureIsGo;
			
		}
		
		System.out.println("���Žý����� �����մϴ�.");
		
	}
			

}
