package lec01.variable03.second;

public class Variables02 {
	
	public static void main(String[] args) {
		
		GoodsVO01 gdsVO01 = new GoodsVO01();
		GoodsVO01 gdsVO02 = new GoodsVO01();
		
		gdsVO01.gdsNo = "gds001";
		gdsVO01.gdsName = "��";
		gdsVO01.gdsPrice = 500;
		gdsVO01.gdsQuantity = 1;
		
		gdsVO02.gdsNo = "gds002";
		gdsVO02.gdsName = "�޹�";
		gdsVO02.gdsPrice = 2000;
		gdsVO02.gdsQuantity = 2;
		
		System.out.println("��ǰ1 ��ȣ : " + gdsVO01.gdsNo);
		System.out.println("��ǰ1 �̸� : " + gdsVO01.gdsName);
		System.out.println("��ǰ1 ���� : " + gdsVO01.gdsPrice);
		System.out.println("��ǰ1 ���� : " + gdsVO01.gdsQuantity);
		
		System.out.println("��ǰ2 ��ȣ : " + gdsVO02.gdsNo);
		System.out.println("��ǰ2 �̸� : " + gdsVO02.gdsName);
		System.out.println("��ǰ2 ���� : " + gdsVO02.gdsPrice);
		System.out.println("��ǰ2 ���� : " + gdsVO02.gdsQuantity);
		
	}

}
