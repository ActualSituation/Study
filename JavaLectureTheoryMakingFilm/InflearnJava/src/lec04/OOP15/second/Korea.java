package lec04.OOP15.second;

import java.util.*;

public class Korea extends Country {
	
	public String special = "�дܱ����̸� �������̴�.";
	
	public void showDefault() {
		
		List<String> strList = new ArrayList<String>();
		
		String species = super.species;
		String haveMust = super.haveMust;
		System.out.println("�� : " + species);
		System.out.println("�ʿ��� �� : " + haveMust);
	}

	@Override
	public void mainEat() {
		System.out.println("��� ��ġ�� �Դ´�.");
	}
	
}
