package lec01.array05.ninth;

import java.util.Arrays;

public class Array09 {
	
	public static void main(String[] args) {
		
		int[] intArr1 = new int[] {5, 9, 3, 1, 2};
		System.out.println(Arrays.toString(intArr1));
		
		Arrays.sort(intArr1);
		System.out.println("���ĵȤ� �迭 : " + Arrays.toString(intArr1));
		
		String[] strArr1 = new String[] {"��Ʈ", "����", "��ũ��", "����̹�", "��"};
		System.out.println(Arrays.toString(strArr1));
		Arrays.sort(strArr1);
		System.out.println("���ĵ� ���ڿ� �迭 : " + Arrays.toString(strArr1));
		
	}

}
