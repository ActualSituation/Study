package ver2_lec01;

public class MainMethod {
	
	public static void main(String[] args) {
		
		CocaCola coca = new CocaCola();
		
		coca.showColaName("��ī�ݶ�� ���ִ�.");
		coca.showColaProperty();
		coca.whereIsCocaCola();
		
		PepsiCola pepsi = new PepsiCola();
		pepsi.showColaName("����ݶ� ���ִ�.");
		pepsi.showColaProperty();
		pepsi.whereIsPepsiCola();
		
	}

}
