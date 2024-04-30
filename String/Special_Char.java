package String;

import java.util.Arrays;

public class Special_Char {

	public static void main(String[] args) {
		String s1="shashi$@";
		int num=s1.length();
		char[] c1=s1.toCharArray();
		int count=0;
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++) {
			boolean b1=Character.isAlphabetic(c1[i]);
			
			if(b1==true) {
				count++;
			}
		}
		int splCount=num-count;
		System.out.println("Count of spcl char in the given string is "+splCount);
	}

}
