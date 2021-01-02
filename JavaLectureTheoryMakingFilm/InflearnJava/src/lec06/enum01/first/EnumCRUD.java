package lec06.enum01.first;

public enum EnumCRUD {
	
	CREATE(1, "����"), READ(2, "�б�"), UPDATE(3, "����"), DELETE(4, "����");
	
	private int intValue;
	private String strName;
	
	private EnumCRUD(int intValue, String strName) {
		this.intValue = intValue;
		this.strName = strName;
	}

	public int getIntValue() {
		return intValue;
	}

	public String getStrName() {
		return strName;
	}

}
