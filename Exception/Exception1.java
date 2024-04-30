package Exception;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		int a=1/sc.nextInt();
		System.out.println(a);
		} 
		catch(ArithmeticException a) {
			System.out.println("Im Arithmetic");
		}
	}

}
