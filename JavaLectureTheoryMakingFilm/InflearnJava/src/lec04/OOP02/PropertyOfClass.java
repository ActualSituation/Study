package lec04.OOP02;

import java.util.ArrayList;
import java.util.List;

public class PropertyOfClass {
	
	public static int entityCount;
	
	public String goodsNo;
	public String goodsName;
	public String goodsPrice;

	public enum EnumDataType {
		INSERT, UPDATE, DELETE, NORMAL
	}
	
	public EnumDataType enumDataType = EnumDataType.NORMAL;
	
	static {
		System.out.println("Goods ::: ���� �ʱ�ȭ ����");
		System.out.println("Goods entity count : " + entityCount);
		System.out.println("���� �ʱ�ȭ�� ������ ����ɱ��?");
	}
	
	{
		System.out.println("�ʱ�ȭ ���� �����մϴ�.");
		entityCount++;
		
		goodsNo = "goods" + entityCount;
		
		System.out.println("��ǰ��ȣ : " + goodsNo);
	}
	
	public PropertyOfClass() {
		System.out.println("�⺻ ������ �Լ��� �����մϴ�.");
	}
	
	public PropertyOfClass(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public PropertyOfClass(String goodsName, String goodsPrice) {
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}

	@Override
	public String toString() {
		return "PropertyOfClass [goodsNo=" + goodsNo + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
	
	public static class InnerClassInfo {
		public static String[] innerClassPropertiesName = new String[] {"��ǰ��ȣ", "��ǰ��", "�ܰ�"};
		public static int[] innerClassPropertiesPrice = new int[] {100, 1000, 2500, 3500};
	}
	
}
