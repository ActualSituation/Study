package var;

public class Pvalue1 {
	
	public static void main(String[] args) {
		
		// showFloatMethod();
		showDoubleMethod();
		
	}
	
	public static void showFloatMethod() {

		/**
		 * float �ڷ����� �Ǽ��� ��Ÿ���� ���� �ڷ����Դϴ�.
		 * ū ���̶� �ϸ� int�� long�� �� �� ������ �ڷ����� ��Ÿ���� ��������,
		 * ���� �� �ִ� �ڷ��� ũ���� ���̰� �ִ� ��ó��,
		 * float�� double���� ���� �� �ִ� �ڷ��� ũ���� ���̰� �ֽ��ϴ�.
		 * float�� double���� ���� ũ���Դϴ�.
		 * 
		 * ���� float�� double�� �����Կ� �־� double�� �����ϴ� ��찡
		 * �� �����ϴ�.
		 * �ϴ� float�� �ڷḦ ������ �� �� ���� �ڿ� f�� �ٿ���� �Ѵٴ� ��Ģ�� �ֽ��ϴ�.
		 * �׸��� double�� float���� �ڷ��� ũ�Ⱑ ũ�� ������,
		 * ���ϱ⳪ �����⸦ ������ ���, ����� ���� ũ�Ⱑ �� �����ϴٴ� ���� �ֽ��ϴ�.
		 * 
		 * �׷��� ���Ϲ��� �ص� double�� ���� ū ������ ���� �ڿ� f�� ������ �ʾƵ� 
		 * �ȴٴ� ���Դϴ�.
		 * �׷��� ������ �ƹ����� double�� �����ϴ� ��찡 �� ���� ������... �մϴ�.
		 */
		
		float fValue = 0.0f;
		
		System.out.println("fValue : " + fValue);
		
		float cmpValue = 3.0f;
		fValue = 10.0f;
		
		float saveValue = 0.0f;
		
		System.out.println("fValue : " + fValue);
		System.out.println("cmpValue : " + cmpValue);
		
		saveValue = fValue / cmpValue;
		
		/**
		 * �����ϰ� float �ڷ������� �����⸦ �غ��ҽ��ϴ�.
		 * �̿ܿ��� ���ϱ�, ����, ���ϱ� � �� �� �ֽ��ϴ�.
		 * float �ڷ����� double �ڷ������� �� �� ���� ũ����
		 * �����͸� ��� �뵵�� ���� �Ǽ��� �ڷ����̶�� �ƽø� �����ϴ�.
		 */
		System.out.println("float �ڷ����� ���� ���� �� : " + saveValue);
		
	}
	
	public static void showDoubleMethod() {
		
		/**
		 * double �ڷ����� float�� ���������� �Ǽ��� �ڷ����Դϴ�.
		 * double �ڷ����� float���� �޸� �ڿ� f�� ������ �ʾƵ� �˴ϴ�.
		 * �׳� �Ǽ��� ��� ������ �ָ� �Ǵ� ��������.
		 * �ڵ带 ���ڽ��ϴ�.
		 */
		
		double originalDouble = 0.0;
		
		System.out.println("double ���� : " + originalDouble);
		
		/**
		 * double �ڷ����� ������ �����Դϴ�.
		 * ���� ����, �Ǽ��� �ڷ����� �ʱ�ȭ�� ���� 0���� �ʱ�ȭ�� �մϴ�.
		 * ���α׷��ӵ鸶��, �����ڸ��� Ư¡�� �ְ�����.
		 * ���� ���������� �ڷ������� 0���� �ʱ�ȭ�ϴ� ���� ��ȣ�մϴ�.
		 * ������ �ʱ�ȭ�� �����ν� Ȯ���� ���� ������ �ְ� �����Ѵٴ� �ǹ̰� �ֽ��ϴ�.
		 * ���� ��ȣ�̱⵵ �ϸ� ����, �����ϸ� �׾ư� �ڵ� ��Ÿ���̶�,
		 * ó�� �����Ͻô� �е��� ���� �� �ڵ� ��Ÿ���� �����Ͻô� �͵� �ణ�� ������ �˴ϴ�.
		 */
		
		double multipleDouble = 2.5;
		originalDouble = 1.3;
		
		double saveDouble = 0.0;
		
		System.out.println("multipleDouble : " + multipleDouble);
		System.out.println("originalDouble : " + originalDouble);
		
		saveDouble = originalDouble * multipleDouble;
		
		System.out.println("double ���ϱ� ��� : " + saveDouble);
		
		multipleDouble = 0.0;
		originalDouble = 0.0;
		saveDouble = 0.0;
		
		/**
		 * ������ ������ ����� �ڷ����� �ʱ�ȭ�����ִ� ����Դϴ�.
		 * 0.0�̶� ���� �����Ͽ� ������ ������ �����̳� ��Ÿ ����� ���������
		 * ������ ����� ������ �����ϴ� ���Դϴ�.
		 * �׷� ������ �ٽ� �� �������� ����Ͽ� ���ο� double �ڷ�����
		 * ������ �����ؼ� ����� �� �ֽ��ϴ�.
		 */
		
		multipleDouble = 3.0;
		originalDouble = 10.0;
		saveDouble = originalDouble / multipleDouble;
		
		/**
		 * �����ϰ� �������� ����� Ȯ���� �� �ֽ��ϴ�.
		 * float���� ���̰� ���̽� �̴ϴ�.
		 * �� �� Ȯ���ϰ� �����?
		 */
		
		System.out.println("saveDouble ������ : " + saveDouble);
		
		float tmpOrgFloat = 10.0f;
		float tmpDivFloat = 3.0f;
		float tmpSaveFloat = 0.0f;
		
		tmpSaveFloat = tmpOrgFloat / tmpDivFloat;
		
		System.out.println("saveFloat ������ : " + tmpSaveFloat);
		
		/**
		 * �Ϻη� �Ҽ����� �ſ� �� ������ �����⸦ �߽��ϴ�.
		 * �Ҽ����� ���̸� Ȯ���� �� �ֽ��ϴ�.
		 * double�� float���� �� �� Ȯ���� �� �ֽ��ϴ�.
		 * ������ �����մϴ�.
		 * double�� float���� ������ �� �ִ� �ڷ��� ũ�Ⱑ ũ�ϱ��.
		 * �׸��� �Ҽ����� ���� �� ���� ǥ���� ���� ���� �� ���������ٴ� ���� �ֽ��ϴ�.
		 * �����̴� ���� ������ ���� ������� �ʾƵ� �˴ϴ�.
		 * double�� float�� ������ ���⼭ ��ġ�ڽ��ϴ�.
		 */
		
	}

}
