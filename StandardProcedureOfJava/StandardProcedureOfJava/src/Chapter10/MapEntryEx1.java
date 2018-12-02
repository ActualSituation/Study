package Chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryEx1 {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("����", "�ٳ���");
		map.put("�", "��");
		map.put("�߰�", "ȣ��");
		map.put("ä��", "�丶��");
		map.put("����", "��û�");
		map.put("����", "����");
		map.put("����", "�ٸ���");
		
		Set<String> iterSet1 = map.keySet();
		Iterator<String> iterator1 = iterSet1.iterator();
		while(iterator1.hasNext()) {
			String key = iterator1.next();
			System.out.println("Ű : " + key + ", ��� : " + map.get(key));
		} 
		
		Iterator<String> iterator2 = map.keySet().iterator();		
		System.out.println("\niterator2");
		while(iterator2.hasNext()) {
			String key = iterator2.next();
			System.out.println("Ű : " + key + ", ��� : " + map.get(key));
		}
		
		System.out.println("\nMap.Entry");
		for(Map.Entry<String, Object> entry1 : map.entrySet()) {
			System.out.println("Ű : " + entry1.getKey() + ", ��� : " + entry1.getValue());
		}
		
		System.out.println("\nKeySet");
		for(String key : map.keySet()) {
			System.out.println("Ű : " + key + ", ��� : " + map.get(key));
		}
		
	}

}
