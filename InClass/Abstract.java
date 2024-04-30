package InClass;

abstract class Google{
	abstract void login();
	abstract void registration();
}
public class Abstract extends Google{
	
	void login() {
		System.out.println("Im login ");
	}
	
	void registration() {
		System.out.println("Im registration");
	}

	public static void main(String[] args) {
		Abstract a1=new Abstract();
		a1.login();
		a1.registration();
	}

}
