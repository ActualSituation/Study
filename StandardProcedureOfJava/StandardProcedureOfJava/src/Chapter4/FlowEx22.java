package Chapter4;

public class FlowEx22 {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		
		/**
		 * for(int tmp : arr)
		 * 
		 * for(���� �ݺ����� ���鼭 �ϳ��� ���� �� : �迭, ����Ʈ �� ��ü ���� ����ִ� ������)
		 * 
		 * ���� for���� �Ϲ����� for���� �޸� �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ����� �� �ִٴ� ������ ����
		 */
		
		System.out.println();
		System.out.println("sum=" + sum);
	}

}
