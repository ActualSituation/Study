package lec01.array05.third;

import java.util.Arrays;

public class Array03 {
	
	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		strArr[0] = "����";
		strArr[1] = "����";
		strArr[2] = "û��";
		
		System.out.println(Arrays.toString(strArr));
		
		String[] strArr1 = new String[] {"Hello", "World"};
		System.out.println(Arrays.toString(strArr1));
		
		double[] dbArray1 = new double[3];
		dbArray1[0] = 1.1;
		dbArray1[1] = 2.1;
		dbArray1[2] = 3.1;
		
		System.out.println(Arrays.toString(dbArray1));
		
	}

}
