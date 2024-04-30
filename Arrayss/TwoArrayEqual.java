package Arrayss;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {
		int no1[]=new int[3];
		int no2[]=new int[3];
		no1[0]=10;
		no1[1]=20;
		no1[2]=30;
		
		no2[0]=10;
		no2[1]=20;
		no2[2]=30;
		
		boolean b1=Arrays.equals(no1, no2);
System.out.println(b1);
	}

}
