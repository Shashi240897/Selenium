package Assignements;

abstract class Two{
	abstract void mul();
	abstract void div();
	
	public void sum1() {
		System.out.println("Im sum 1");
	}
}
abstract class One extends Two{
	abstract void add();
	abstract void sub();
	
	public void sum2() {
		System.out.println("Im sum2");
	}
	
	void mul() {
		System.out.println("Im mul");
	}
	
	void div() {
		System.out.println("Im div");
	}
}
public class Assign16 extends One{
	
	public void one() {
		System.out.println("Im one");
	}
	public void two() {
		System.out.println("Im two");
	}

	public static void main(String[] args) {
		Assign16 assign = new Assign16();
		assign.add();
		assign.div();
		assign.mul();
		assign.sub();
		assign.sum1();
		assign.sum2();
		assign.one();
		assign.two();

	}
	@Override
	void add() {
		System.out.println("Im add");
		
	}
	@Override
	void sub() {
		System.out.println("Im add");
		
	}

}
