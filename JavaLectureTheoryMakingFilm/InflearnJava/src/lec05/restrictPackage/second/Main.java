package lec05.restrictPackage.second;

import lec05.restrictPackage.first.GoodsVO;

public class Main {
	
	public static void main(String[] args) {
		
		GoodsVO goodsVO = new GoodsVO();
		goodsVO.goodsName = "����";
		
		System.out.println("��ǰ ���� : " + goodsVO.getGoodsPrice());
		goodsVO.setGoodsPrice(1000);
		System.out.println("����� ��ǰ ���� : " + goodsVO.getGoodsPrice());
		
	}

}
