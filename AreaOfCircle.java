import java.util.Scanner;

public class AreaOfCircle {
	
	static final double pi=3.14;
	int r1; double r2;
	
	void radius1() {
		System.out.println("Enter int radius value");
		Scanner sc1=new Scanner(System.in);
		r1=sc1.nextInt();
		double area1=pi*r1*r1;
		System.out.println("Area of circle 1 "+area1);
	}
	
	void radius2() {
		System.out.println("Enter double radius value");
		Scanner sc2=new Scanner(System.in);
		r2=sc2.nextInt();
		double area2=pi*r2*r2;
		System.out.println("Area of circle 1 "+area2);
		sc2.close();
	}
	public static void main(String[] args) {
		AreaOfCircle c1=new AreaOfCircle();
		c1.radius1();
		c1.radius2();

	}

}
