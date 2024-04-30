package inheritance;
class e{
	void mul() {
		System.out.println("im add");
	}
}
class d extends e{
	void sub() {
		System.out.println("im sub");
	}
}
class c extends d{
	void div() {
		System.out.println("im mul");
	}
}
class b extends c{
	void mod() {
		System.out.println("im div");
	}
}
class a extends b{
	void add() {
		System.out.println("im mod");
	}
}
public class MultiLevel extends a {

	public static void main(String[] args) {
		MultiLevel m1 = new MultiLevel();
		m1.add();
		m1.div();
		m1.mod();
		m1.sub();
		m1.mul();

	}

}
