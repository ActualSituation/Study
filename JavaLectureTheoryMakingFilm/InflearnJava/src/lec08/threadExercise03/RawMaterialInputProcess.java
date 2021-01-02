package lec08.threadExercise03;

public class RawMaterialInputProcess implements Runnable {

	protected boolean stop = false;
	protected int count = 1;
	protected String rawMaterialName = "�ö�ƽ";
	
	public void setStop(boolean isStop) {
		stop = isStop;
	}
	
	@Override
	public void run() {
		System.out.println("����� ���� ������ ���۵Ǿ����ϴ�.");
		while (stop == false) {
			try {
				synchronized (StringFactoryProcess.rawMaterialPlasticList) {
					int rawMaterialListSize = StringFactoryProcess.rawMaterialPlasticList.size();
					if (rawMaterialListSize > 9) {
						System.out.println("����� ������ �Ͻ� �����մϴ�.");
						Thread.sleep(1000);
						continue;
					} else if (rawMaterialListSize > 0 && rawMaterialListSize < 10) {
						inputRawMaterialWork(count);
						System.out.println("����ᰡ ���ԵǾ����ϴ�.");
					} else if (rawMaterialListSize == 0) {
						inputRawMaterialWork(count);
						System.out.println("����ᰡ ���ԵǾ����ϴ�.");
					}
					Thread.sleep(1000);
					System.out.println("[[�߰��� ��⿭]]" + StringFactoryProcess.rawMaterialPlasticList);
					count++;
				}
			} catch (Exception e) {
				System.out.println("����� ���� ������ ������ ������ϴ�.");
				e.printStackTrace();
				break;
			}
		}
	}
	
	public void inputRawMaterialWork(int count) {
		String inputRawMaterial = rawMaterialName + " " + count;
		StringFactoryProcess.rawMaterialPlasticList.add(inputRawMaterial);
	}

}
