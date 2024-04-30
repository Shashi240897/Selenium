
public class Sib2 {
	
	Sib2(){
		System.out.println("Im the constructor");
	}
	
	
	
	{
		System.out.println("Im not static in nature");
	}

	public static void main(String[] args) {
		Sib2 s2=new Sib2();

	}
	static{
		System.out.println("Im static in nature");
	}

}
