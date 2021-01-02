package lec08.threadExercise03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProductMakeProcess extends Thread {
	
	protected String productName = "���";
	private boolean stop = false;
	
	public void setStop(boolean isStop) {
		stop = isStop;
	}
	
	@Override
	public void run() {
		int makeProcessCount = 0;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		Date todayDate = new Date();
		String strToday = simpleDateFormat.format(todayDate);
		
		System.out.println("��ǰ ���� ������ ���۵Ǿ����ϴ�.");
		
		while (stop == false) {
			try {
				Thread.sleep(2000);
				
				String rawMaterial = getRawMaterial();
				System.out.println("�߰��縦 �����Ͽ����ϴ�.  " + rawMaterial);
				
				StringBuilder stringProductBuilder = new StringBuilder(productName)
															.append("-")
															.append(strToday)
															.append("-")
															.append(makeProcessCount);
				String newStringProduct = stringProductBuilder.toString();
				
				Map<String, Integer> productMap =
						makeProduct(rawMaterial, newStringProduct, makeProcessCount);
				System.out.println("[[��ǰ�� ����Ǿ����ϴ�.]]  " + makeProcessCount);
				StringFactoryProcess.productStringList.add(productMap);
				makeProcessCount++;
			} catch (Exception e) {
				System.out.println("��ǰ ���� ������ ������ ������ϴ�.");
				e.printStackTrace();
				break;
			}
		}
		System.out.println("��ǰ ���� ������ �����Ǿ����ϴ�.");
	}
	
	public synchronized String getRawMaterial() throws Exception {
		if (StringFactoryProcess.rawMaterialPlasticList.size() > 0) {
			return StringFactoryProcess.rawMaterialPlasticList.poll();
		} else {
			return "empty";
		}
	}
	
	public Map<String, Integer> makeProduct(String rawMaterial
											, String newStringProduct
											, int count) throws Exception {
		
		if (rawMaterial.equals("empty") == false) {
			Map<String, Integer> productMap = new HashMap<String, Integer>();
			productMap.put(newStringProduct, count);
			return productMap;
		} else {
			throw new Exception("����ᰡ ��� ���� ������ ��� �ߴ��մϴ�.");
		}
	}

}
