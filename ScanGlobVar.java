import java.util.Scanner;

public class ScanGlobVar {
	
	static int a,b,c,d,e,f;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values of a& b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		System.out.println("add = "+c);
		System.out.println("sub = "+d);
		System.out.println("mul = "+e);
		System.out.println("div = "+f);

	}

}
