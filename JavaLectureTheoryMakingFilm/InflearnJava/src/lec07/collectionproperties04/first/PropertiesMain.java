package lec07.collectionproperties04.first;

import java.util.Properties;
import java.util.Set;

public class PropertiesMain {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put(1, "LNG");
		properties.put(2, "LPG");
		properties.put(3, "��ź");
		properties.put(4, "����");
		properties.put(5, "ǳ��");
		properties.put(6, "�¾籤");
		properties.put(7, "�¾翭");
		properties.put(8, "����");
		System.out.println("�����͸� Ȯ���մϴ�.");
		System.out.println(properties);
		
		properties.put(2, "��������");
		System.out.println("������ �����͸� Ȯ���մϴ�.");
		System.out.println(properties);
		
		System.out.println("�����ϱ� �� �������Դϴ�.");
		System.out.println(properties);
		properties.remove(2);
		System.out.println("������ �����͸� Ȯ���մϴ�.");
		System.out.println(properties);
		
		Object oneObject = properties.get(1);
		System.out.println("�ϳ��� �ڷ� : " + oneObject);
		
		int size = properties.size();
		for (int i = 0; i <= size; i++) {
			Object o = properties.get(i);
			System.out.println("�� : " + o);
		}
		
		properties = new Properties();
		
		properties.put("1", "����");
		properties.put("2", "�λ�");
		properties.put("3", "ȸ��");
		properties.put("4", "����");
		properties.put("5", "����");
		properties.put("6", "��ȹ");
		properties.put("7", "�繫");
		
		System.out.println("\n\n\n");
		Set<Object> objects = properties.keySet();
		System.out.println("�����͸� Ȯ���մϴ�.");
		for (Object o : objects) {
			String property = properties.getProperty((String) o);
			System.out.println("�� : " + property);
		}
		
	}

}
