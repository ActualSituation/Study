package No1;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	
	public static void main(String[] args) {
		System.out.println("== �޴� ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ���");
		
		InputStream is = System.in;
		
		char inputChar = ' ';
		try {
			inputChar = (char) is.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch(inputChar) {
		case '1' :			
			System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
			break;
		case '2' :
			System.out.println("���� ����� �����ϼ̽��ϴ�.");
			break;			
		case '3':
			System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
			break;
		case '4' :
			System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
			break;
		}
	}
	
}
