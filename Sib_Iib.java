
public class Sib_Iib {

	Sib_Iib() {
		System.out.println("Im constructor");
	}

	public static void main(String[] args) {

		Sib_Iib si = new Sib_Iib();
		System.out.println("I am main");

	}

	static {
		System.out.println("Im Sib");
	}

	{
		System.out.println("Im Iib");
	}

}
