package lec07.collectioniterator07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class IteratorMain {
	
	public static void main(String[] args) {
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("1", "����ϻ����");
		dataMap.put("2", "���������");
		dataMap.put("3", "�޸𸮹ݵ�ü�����");
		dataMap.put("4", "�ý��۹ݵ�ü�����");
		dataMap.put("5", "�ڵ��������������");
		
		System.out.println(dataMap);
		
		Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
		Iterator<Map.Entry< String, Object>> iteratorData = entrySetData.iterator();
		
		while (iteratorData.hasNext()) {
			Map.Entry<String, Object> nextData = iteratorData.next();
			System.out.println("Ű : " + nextData.getKey() + ", [[[]]] �� : " + nextData.getValue());
		}
		
		List dataList = new ArrayList();
		dataList.add("��������");
		dataList.add("���ְ���");
		dataList.add("õ�Ȱ���");
		dataList.add("������");
		dataList.add("â������");
		
		System.out.println(dataList);
		
		ListIterator listIterator = dataList.listIterator();
		
		while (listIterator.hasNext()) {
			Object next = listIterator.next();
			System.out.println("�� ���� : " + next);
		}
		
	}

}
