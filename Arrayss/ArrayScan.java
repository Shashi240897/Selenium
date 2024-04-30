package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {
		int[] a1= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));
	}

}
