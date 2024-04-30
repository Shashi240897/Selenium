//USing static methods perform add,mul,sub & div with values

package Feb21Class;

public class Assign3 {
   
	
	static void add() {
		int n1=10,n2=20,n3;
		n3=n1+n2;
		System.out.println(n3);}
	static void subtract() {
		int n1=10,n2=20,n3;
		n3=n1-n2;
		System.out.println(n3);
		
	}
	static void mul() {
		int n1=10,n2=20,n3;
		n3=n2*n1;
		System.out.println(n3);
	}
	static void div() {
		int n1=10,n2=20,n3;
		n3=n1/n2;
		System.out.println(n3);
	}

	public static void main(String[] args) {
		System.out.println("Starting main method");
		System.out.println("");
		add();
		subtract();
		mul();
		div();
		System.out.println();
		System.out.println("Ending main method");

	}

}
