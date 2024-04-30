package Arrayss;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="shashi";
		String s2="manish";
		
		char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	
	boolean b=Arrays.equals(c1, c2);
	if(b==true) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("not anagram");
	}
	}

}
