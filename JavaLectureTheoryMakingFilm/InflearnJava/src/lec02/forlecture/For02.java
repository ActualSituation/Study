package lec02.forlecture;

import java.util.ArrayList;
import java.util.List;

public class For02 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		for (int i : intList) { 
			System.out.println("i : " + i);
		}
		
		String[] arrStrCountry = new String[] {"�ѱ�", "�̱�", "�߱�", "���þ�", "�Ϻ�"};
		
		for (String strCountry : arrStrCountry) {
			System.out.println("���� �̸� : " + strCountry);
		}
		
	}

}
