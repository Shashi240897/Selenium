package Feb27;

public class Constructor1 {

	Constructor1(){
        System.out.println("Constructor without param");
	}

	Constructor1(int a){
		System.out.println("Constructor with int param");
	}

	Constructor1(float a){
		System.out.println("Constructor with float param");
	}
	Constructor1(char a){
		System.out.println("Constructor with char param");
	}
	Constructor1(String a){
		System.out.println("Constructor with string param");
	}

	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(10);
		Constructor1 c3 = new Constructor1(10.5f);
		Constructor1 c4 = new Constructor1('s');
		Constructor1 c5 = new Constructor1("hi");
		

	}

}
