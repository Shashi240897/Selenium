package Mar7th;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		System.out.println("Enter value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		
		case 1:
		{
			System.out.println("Im one");
			break;
		}
		case 2:
		{
			System.out.println("Im two");
			break;
		}

		case 3:
		{
			System.out.println("Im three");
			break;
		}
		
		default : 
		{
			System.out.println("Im other");
		}

		}

	}

}
