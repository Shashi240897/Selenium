package Mar8th;

public class ConstructorOverloading_thisCallingStmt {

	ConstructorOverloading_thisCallingStmt(int a){
		System.out.println("1");
	}
ConstructorOverloading_thisCallingStmt(double b){
	this("shashi");
	System.out.println("2");
	}
ConstructorOverloading_thisCallingStmt(char c){
	this(10);
	System.out.println("3");
}
ConstructorOverloading_thisCallingStmt(String d){
	this('c');
	System.out.println("4");
}
	public static void main(String[] args) {
		ConstructorOverloading_thisCallingStmt c1=new ConstructorOverloading_thisCallingStmt(3.14);
	}

}
