package Arrayss;

import java.util.Arrays;

public class Copy_Array_toAnother_Array {

	public static void main(String[] args) {
		int []num=new int[4];
		num[0]=21;
		num[1]=22;
		num[2]=23;
		num[3]=24;
		
		int []num1=new int[4];
		for(int i=0;i<num.length;i++) {
			num1[i]=num[i];
		}
		System.out.println("1st array values");
		System.out.println(Arrays.toString(num));
		System.out.println("2nd array values which is assigned from 1st array");
		System.out.println(Arrays.toString(num1));

	}

}
