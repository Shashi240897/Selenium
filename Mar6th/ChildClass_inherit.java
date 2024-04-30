package Mar6th;

class ParentClass{
	
	static void Parent() {
		System.out.println("Im parent class method");
	}
}

public class ChildClass_inherit extends ParentClass{
	
	static void Child() {
		System.out.println("Im child class method");
	}

	public static void main(String[] args) {
		Parent();
		Child();
	}

}
