package lec01.variable03.fifth;

public class StringExample01 {
	
	public static void main(String[] args) {
		
		String companyName = "�ѱ�";
		System.out.println("companyName : " + companyName);
		
		String cctCompanyName = companyName + "����";
		System.out.println("cctCompanyName : " + cctCompanyName);
		
		String country1 = "�ѱ�";
		String country2 = "�ѱ�";
		boolean boolean1 = country1 == country2;
		System.out.println("boolean1 : " + boolean1);
		
		String strCountry1 = new String("�ѱ�");
		String strCountry2 = new String("�ѱ�");
		boolean boolean2 = strCountry1 == strCountry2;
		System.out.println("boolean2 : " + boolean2);
		
		boolean boolEquals1 = strCountry1.equals(strCountry2);
		System.out.println("boolEquals1 : " + boolEquals1);
		
		StringBuilder sbVar = new StringBuilder("�ѱ�");
		sbVar.append("����");
	    System.out.println("sbVar.toString : " + sbVar.toString());
	    
	    StringBuffer strBufferVar = new StringBuffer("���ڿ�");
	    strBufferVar.append("����");
	    
	    System.out.println("strBufferVar : " + strBufferVar.toString());
		
	}

}
