package Feb26;

public class If_else_if {

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		if(a>b) {
			System.out.println("if stmt executes");
		}
		else if(b>c) {
			System.out.println("1st else if is correct");
		}
		else if(a<c) {
			System.out.println("2nd else if is correct");
		}
		else {
			System.out.println("all stmts false");
		}
	}

}
