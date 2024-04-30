package Mar6th;

class ParentClass1{
	
	static void Parent() {
		System.out.println("Im parent static method");
	}
	
	void Parent2() {
		System.out.println("Im parent NS method");
	}
}

public class ChildClass1_Inherit extends ParentClass1 {
	
	static void Child1() {
		System.out.println("Im child static method");
	}
	
	void Child2() {
		System.out.println("Im child NS method");
	}

	public static void main(String[] args) {
		Parent();
		Child1();
		ChildClass1_Inherit obj = new ChildClass1_Inherit();
		obj.Parent2();
		obj.Child2();

	}

}
