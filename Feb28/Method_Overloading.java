package Feb28;

public class Method_Overloading {
	
	void add() {
		
		System.out.println("addition");
		
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	void add(double a, int b) {
		System.out.println(a+b);
	}
	static void add(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		add('S');
		Method_Overloading m1 = new Method_Overloading();
		m1.add();
		m1.add(10.5, 30);
		m1.add(10, 5.2);

	}

}
