package String;

import java.util.Arrays;

public class String_Numeric {

	public static void main(String[] args) {
		String name = "shashi1";
		char[] c1=name.toCharArray();
		int count=0,count1=0;
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<name.length();i++) {
		boolean b1=Character.isDigit(c1[i]);
		System.out.println(b1);
		
		if(b1==true) {
			count++;
		}
		else {
			count1++;
		}
		
		
	}
		System.out.println("Count of numeric values "+count);
	System.out.println("Count of alpha "+count1);
	}
	

}
