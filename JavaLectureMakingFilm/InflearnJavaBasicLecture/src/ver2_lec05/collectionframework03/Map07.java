package ver2_lec05.collectionframework03;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map07 {
	
	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		hashMap.put("����1", "�ѱ�");
		hashMap.put("����2", "�̱�");
		hashMap.put("����3", "�߱�");
		hashMap.put("����4", "���þ�");
		hashMap.put("����5", "�Ϻ�");
		
		System.out.println(hashMap.toString());
		
		LinkedHashMap lkMap = new LinkedHashMap();
		lkMap.put("����1", "�ѱ�");
		lkMap.put("����2", "�̱�");
		lkMap.put("����3", "�߱�");
		lkMap.put("����4", "���þ�");
		lkMap.put("����5", "�Ϻ�");
		
		System.out.println(lkMap.toString());
		
		String testA1 = "a";
		String testA2 = "a";
		
		int hc1 = testA1.hashCode();
		int hc2 = testA2.hashCode();
		
		System.out.println("hc1 : " + hc1);
		System.out.println("hc2 : " + hc2);
		
		String nationName1 = String.valueOf("�ѱ�");
		String nationName2 = String.valueOf("�ѱ�");
		
		int nn1hc = nationName1.hashCode();
		int nn2hc = nationName2.hashCode();
		
		System.out.println("nn1hc : " + nn1hc);
		System.out.println("nn2hc : " + nn2hc);
		
		/**
		 * id : 1
		 * procureRequestNo : 20200816001
		 * procureItemCd : 0001
		 * procureItenNm : �Ұ��� ���
		 * procureUnitCd : 0002
		 * procureUnitNm : kg
		 * procureQuantity : 10
		 * procurePrice : 2000
		 */
		
	}

}