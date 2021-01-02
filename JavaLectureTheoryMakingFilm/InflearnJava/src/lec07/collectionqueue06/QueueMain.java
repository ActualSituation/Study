package lec07.collectionqueue06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("���������");
		queue.offer("�÷�Ʈ�����");
		queue.offer("�������");
		queue.offer("���������");
		queue.offer("�κ������");
		queue.offer("�����������");
		
		System.out.println(queue);
		
		int size = queue.size();
		for (int i = 0; i < size; i++) {
			String poll = queue.poll();
			System.out.println("����� �� : " + poll);
		}
		
		System.out.println(queue);
		
		queue.add("����Ʈ��Ʈ");
		queue.add("ȣ����Ʈ");
		queue.add("����Ͻ�ȣ����Ʈ");
		queue.add("�鼼����Ʈ");
		queue.add("�׸���ũ��Ʈ");
		
		System.out.println(queue);
		
		for (int i = 0; i < queue.size(); i++) {
			String peek = queue.peek();
			System.out.println("����� �� : " + peek);
		}
		
	}

}
