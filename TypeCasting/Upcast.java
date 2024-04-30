package TypeCasting;

class Parent{
	void userName() {
		
	}
	void password() {
		
	}
}
public class Upcast extends Parent{
	
	void login() {
		
	}

	public static void main(String[] args) {
		Parent p1=new Upcast();
		p1.userName();
		p1.password();
		

	}

}
