package inheritance;
class Parent1{
	
	Parent1(int a){
		System.out.println("Im parameterized parent constructor");
	}
	
}

public class Parameterized extends Parent1{
	
	Parameterized(){
		super(10);
		System.out.println("im non para child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parameterized p1 = new Parameterized();
	}

}
