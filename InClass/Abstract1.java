package InClass;
abstract class Facebook{
	void add() {
		int a=10, b=20;
		System.out.println(a+b);
	}
	
	static void sub() {
		System.out.println(Math.subtractExact(10, 20));
	}
	
	abstract void mul();
	abstract void div();
}
public class Abstract1 extends Facebook {
	
	void modulus() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void div() {
		// TODO Auto-generated method stub
		
	}

}
