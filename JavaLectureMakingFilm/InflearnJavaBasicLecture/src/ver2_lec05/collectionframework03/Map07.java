package ver2_lec05.collectionframework03;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map07 {
	
	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		hashMap.put("국가1", "한국");
		hashMap.put("국가2", "미국");
		hashMap.put("국가3", "중국");
		hashMap.put("국가4", "러시아");
		hashMap.put("국가5", "일본");
		
		System.out.println(hashMap.toString());
		
		LinkedHashMap lkMap = new LinkedHashMap();
		lkMap.put("국가1", "한국");
		lkMap.put("국가2", "미국");
		lkMap.put("국가3", "중국");
		lkMap.put("국가4", "러시아");
		lkMap.put("국가5", "일본");
		
		System.out.println(lkMap.toString());
		
		String testA1 = "a";
		String testA2 = "a";
		
		int hc1 = testA1.hashCode();
		int hc2 = testA2.hashCode();
		
		System.out.println("hc1 : " + hc1);
		System.out.println("hc2 : " + hc2);
		
		String nationName1 = String.valueOf("한국");
		String nationName2 = String.valueOf("한국");
		
		int nn1hc = nationName1.hashCode();
		int nn2hc = nationName2.hashCode();
		
		System.out.println("nn1hc : " + nn1hc);
		System.out.println("nn2hc : " + nn2hc);
		
		/**
		 * id : 1
		 * procureRequestNo : 20200816001
		 * procureItemCd : 0001
		 * procureItenNm : 소고기 등심
		 * procureUnitCd : 0002
		 * procureUnitNm : kg
		 * procureQuantity : 10
		 * procurePrice : 2000
		 */
		
	}

}
