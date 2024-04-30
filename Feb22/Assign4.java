package Feb22;

public class Assign4 {

	static void one() {
		System.out.println("Static 1");
	}
	static void two() {
		System.out.println("Static 2");
	}

	static void three() {
		System.out.println("Static 3");
	}

	static void four() {
		System.out.println("Static 4");
	}

	static void five() {
		System.out.println("Static 5");
	}

	public void ns1() {
		System.out.println("non Static 1");
	}
	public void ns2() {
		System.out.println("non Static 2");
	}
	public void ns3() {
		System.out.println("non Static 3");
	}
	public void ns4() {
		System.out.println("non Static 4");
	}
	public void ns5() {
		System.out.println("non Static 5");
	}


	public static void main(String[] args) {
		System.out.println("Static methods :");
		
		one();
		two();
		three();
		four();
		five();
		System.out.println("");
		System.out.println("Non static methods :");
		Assign4 a4 = new Assign4();
		a4.ns1();
		a4.ns2();
		a4.ns3();
		a4.ns4();
		a4.ns5();

	}

}
