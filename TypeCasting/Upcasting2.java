package TypeCasting;
class GrandParent{
	void add() {
		
	}
}
class ParentClass extends GrandParent{
	void sub() {
		
	}
}

public class Upcasting2 extends ParentClass{
    void mul() {
    	
    }
	public static void main(String[] args) {
		ParentClass pc=new Upcasting2();//upcasting
		pc.add();
		pc.sub();
		Upcasting2 up=(Upcasting2)pc;//downcasting
		up.add();
		up.sub();
		up.mul();
	}

}
