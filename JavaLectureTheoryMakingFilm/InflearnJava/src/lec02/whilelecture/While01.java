package lec02.whilelecture;

public class While01 {
	
	public static void main(String[] args) {
		
		int markIndex = 0;
		while (markIndex < 5) {
			System.out.println("markIndex : " + markIndex);
			markIndex++;
		}
		
		String[] strCountryArr = new String[] {"�ѱ�", "�̱�", "�߱�", "���þ�", "�Ϻ�", "��Ʈ��", "�ε��׽þ�", "�ʸ���"};
		markIndex = 0;
		int countryLength = strCountryArr.length;
		while (markIndex < countryLength) {
			String strCountry = strCountryArr[markIndex];
			System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		}
		
		System.out.println("\n\n");
		
		markIndex = 0;
		while (markIndex < countryLength) {
			if (markIndex == 2) {
				break;
			}
			String strCountry = strCountryArr[markIndex];
			System.out.print("index : " + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		}
		
		System.out.println("\n\n");
		
		markIndex = 0;
		System.out.println("2�� ����� continue�� �����մϴ�.");
		while (markIndex < countryLength) {
			if (markIndex % 2 == 0) {
				markIndex++;
				continue;
			}
			String strCountry = strCountryArr[markIndex];
			System.out.print("markIndex :" + markIndex + ",  strCountry : " + strCountry + "\t\t\t");
			markIndex++;
		} 
		
	}

}
