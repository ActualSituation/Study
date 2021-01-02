package lec07.collectionarrays08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {0, 5, 3, 1, 2};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int getValue = Arrays.binarySearch(arr, 1);
		System.out.println("1�� ��ġ�� : " + getValue);
		getValue = Arrays.binarySearch(arr, 5);
		System.out.println("5�� ��ġ�� : " + getValue);
		
		String[] strArr = new String[] {"����", "���", "��õ", "���", "����", "��û", "����", "����"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);;
		System.out.println(Arrays.toString(strArr));
		int whereIndex1 = Arrays.binarySearch(strArr, "���");
		int whereIndex2 = Arrays.binarySearch(strArr, "��õ");
		
		System.out.println("���� �� ��° : " + whereIndex1);
		System.out.println("��õ�� �� ��° : " + whereIndex2);
		
		System.out.println();
		
		String[] strCompany = new String[] {"�Ｚ����", "��ȭ����", "��������", "DB����"};
		System.out.println(Arrays.toString(strCompany));
		int whereIsInsu1 = Arrays.binarySearch(strCompany, "��ȭ����");
		int whereIsInsu2 = Arrays.binarySearch(strCompany, "DB����");
		System.out.println("��ȭ���� : " + whereIsInsu1);
		System.out.println("DB���� : " + whereIsInsu2);
		
		Arrays.sort(strCompany);;
		System.out.println(Arrays.toString(strCompany));
		int isInsu1 = Arrays.binarySearch(strCompany, "��ȭ����");
		int isInsu2 = Arrays.binarySearch(strCompany, "DB����");
		System.out.println("sort ��ȭ���� : " + isInsu1);
		System.out.println("sort DB���� : " + isInsu2);
		
		System.out.println();
		System.out.println();
		
		int[] intArrAlpha = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(intArrAlpha));
		
		int[] arrCopyOf1 = Arrays.copyOf(intArrAlpha, 7);
		System.out.println("7�� ���̸�ŭ �����մϴ�.");
		System.out.println(Arrays.toString(arrCopyOf1));
		
		System.out.println("3�� ���̸�ŭ �����մϴ�.");
		int[] arrCopyOf2 = Arrays.copyOf(intArrAlpha, 3);
		System.out.println(Arrays.toString(arrCopyOf2));
		
		System.out.println();
		
		int[] arrCopyOfRange1 = Arrays.copyOfRange(intArrAlpha, 0, 3);
		System.out.println();
		System.out.println(Arrays.toString(intArrAlpha));
		System.out.println("�ε��� 0�̻� 3�̸�����");
		System.out.println(Arrays.toString(arrCopyOfRange1));
		System.out.println("�ε��� 2�̻� 5�̸�����");
		int[] arrCopyOfRange2 = Arrays.copyOfRange(intArrAlpha, 2, 5);
		System.out.println(Arrays.toString(arrCopyOfRange2));
		
		System.out.println();
		int[] arrFill = new int[3];
		System.out.println("fill()�� �����ϱ� ���� ���Դϴ�.");
		System.out.println(Arrays.toString(arrFill));
		Arrays.fill(arrFill, 3);
		System.out.println(Arrays.toString(arrFill));
		
		int[][] arr2DInt = new int[][] {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}};
		System.out.println();
		System.out.println("�������迭�� �����͸� Ȯ���մϴ�.");
		System.out.println(Arrays.deepToString(arr2DInt));
		
		int[] arrEquals1 = new int[] {1, 2, 3, 4, 5};
		int[] arrEquals2 = new int[] {1, 2, 3, 4, 5};
		boolean boolArrEquals = Arrays.equals(arrEquals1, arrEquals2);
		System.out.println();
		System.out.println("�� ���� ������ �迭�� ������ Ȯ���մϴ�.");
		System.out.println("�� : " + boolArrEquals);
		
		int[][] arrEquals2D1 = new int[][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		int[][] arrEquals2D2 = new int[][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		boolean boolDeepEquals = Arrays.deepEquals(arrEquals2D1, arrEquals2D2);
		System.out.println();
		System.out.println("2���� �迭 �� ���� ������ : " + boolDeepEquals);
		
		Integer[] arrForList = new Integer[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrForList));
		List<Integer> listFromArr = Arrays.asList(arrForList);
		int size = listFromArr.size();
		System.out.println("������ : " + size);
		for (int i = 0; i < size; i++) {
			Object o = listFromArr.get(i);
			System.out.println("����� �� : " + o);
		}
		
		Integer[] arrInteger = new Integer[] {1, 2, 3, 4, 5};
		List cvtList = new ArrayList(Arrays.asList(arrInteger));
		System.out.println();
		System.out.println(cvtList.toString());
		cvtList.add(10);
		System.out.println(cvtList.toString());
		
	}

}
