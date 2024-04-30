import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int num=no1+no2;
		System.out.println(num);
		
		String name=sc.next();
		byte b1=sc.nextByte();
		short b2=sc.nextShort();
		int b3=sc.nextInt();
		long b4=sc.nextLong();
		float b5=sc.nextFloat();
		double b6=sc.nextDouble();

	}

}
