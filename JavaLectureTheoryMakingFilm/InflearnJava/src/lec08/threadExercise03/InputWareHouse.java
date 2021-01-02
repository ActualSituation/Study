package lec08.threadExercise03;

import java.util.HashMap;
import java.util.Map;

public class InputWareHouse extends Thread {
	
	protected String wareHouseName = "��ǰâ��[1]";
	private boolean stop = false;
	public int count = 0;
	
	public void setStop(boolean isStop) {
		stop = isStop;
	}
	
	@Override
	public void run() {
		while(stop == false) {
			try {
				Thread.sleep(2300);
				Map<Integer, Map<String, Integer>> paramInputMap = inputWareHouse(count);
				boolean isStoreSuccess = storeWareHouse(paramInputMap);
				System.out.println();
				if (isStoreSuccess) {
					System.out.println(wareHouseName + "  [[�԰�Ǿ����ϴ�.]]");
				}
				count++;
			} catch(Exception e) {
				System.out.println("�԰� �۾��� �ߴ��մϴ�.");
				e.printStackTrace();
				break;
			}
		}
	}
	
	public synchronized Map<Integer, Map<String, Integer>> inputWareHouse(int count) 
			throws Exception {
		Map<String, Integer> productMap = StringFactoryProcess.productStringList.poll();
		if (productMap != null) {
			Map<Integer, Map<String, Integer>> paramInputMap = new HashMap<Integer, Map<String,Integer>>();
			paramInputMap.put(count, productMap);
			return paramInputMap;
		} else {
			throw new Exception("��ǰ�� ��� �԰� �۾��� ������ �� �����ϴ�.");
		}
	}
	
	public synchronized boolean storeWareHouse(Map<Integer, Map<String, Integer>> paramInputMap) 
			throws Exception {
		
		boolean isSuccess = false;
		
		if (paramInputMap != null) {
			StringFactoryProcess.inputList.add(paramInputMap);
			isSuccess = true;
		} else if (paramInputMap == null) {
			throw new Exception("��ǰ�� ��� â�� ���� �۾��� �����߽��ϴ�.");
		} else {
			isSuccess = false;
		}
		return isSuccess;
	}

}
