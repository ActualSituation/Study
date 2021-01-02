package lec05.generics.forth;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsCollections {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(85);
		scoreList.add(95);
		scoreList.add(100);
		scoreList.add(80);
		
		for (int score : scoreList) {
			System.out.print(score + "\t\t\t");
		}
		
		ArrayList<String> lectureList = new ArrayList<String>();
		lectureList.add("����");
		lectureList.add("����");
		lectureList.add("����");
		lectureList.add("����");
		lectureList.add("��ȸ");
		lectureList.add("����");
		
		System.out.println();
		for (String lecture : lectureList) {
			System.out.print("���� : " + lecture + "\t\t");
		}
		
		HashMap<String, Object> mapCountry = new HashMap<String, Object>();
		mapCountry.put("�ѱ�", "�ƽþ�");
		mapCountry.put("�̱�", "�Ƹ޸�ī");
		mapCountry.put("������", "����");
		mapCountry.put("�Ҹ�����", "������ī");
		
		System.out.println();
		System.out.println(mapCountry.toString());
		
	}

}
