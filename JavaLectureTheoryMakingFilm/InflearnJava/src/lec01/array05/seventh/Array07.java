package lec01.array05.seventh;

public class Array07 {
	
	public static void main(String[] args) {
		
		String[] strArr1 = new String[] {"�ѱ�", "�̱�", "����", "�߱�", "���þ�", "�Ϻ�"};
		String[] strArr2 = new String[] {"�ѹݵ�", "�Ƹ޸�ī", "����", "���Ͼƽþ�", "������", "����"};
		String[][] strArr3 = new String[][] {strArr1, strArr2};
		
		for (int x = 0; x < strArr3.length; x++) {
			for (int y = 0; y < strArr3[x].length; y++) {
				String strValue = strArr3[x][y];
				System.out.println("strValue : " + strValue);
			}
		}
		
	}

}
