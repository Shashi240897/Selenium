import java.util.Scanner;

public class AreaOfCircle1 {
final static double pi=3.14;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r;double area;
		for(int i=1;i<=10;i++) {
			System.out.println("Enter "+i+" radius");
			r=sc.nextInt();
			area=pi*r*r;
			System.out.println(area);
			
		}

	}

}
