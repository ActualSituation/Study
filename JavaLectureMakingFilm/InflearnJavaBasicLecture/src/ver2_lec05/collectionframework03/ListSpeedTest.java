package ver2_lec05.collectionframework03;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest {
	
	public static void main(String[] args) {
		
		long startMillis = System.currentTimeMillis();
		ArrayList arList = new ArrayList();
		
		for (int i = 0; i < 10000000; i++) {
			arList.add(i);
		}
		
		long endMillis = System.currentTimeMillis();
		long diffMillis = endMillis - startMillis;
		
		System.out.println("���� : " + diffMillis);
		
		startMillis = System.currentTimeMillis();
		LinkedList lkList = new LinkedList(); 
		
		for (int i = 0; i < 10000000; i++) {
			lkList.add(i);
		}
		
		endMillis = System.currentTimeMillis();
		diffMillis = endMillis - startMillis;
		
		System.out.println("���� LinkedList : " + diffMillis);
		
	}

}
