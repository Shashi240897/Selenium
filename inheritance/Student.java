package inheritance;

class Mentor{
	
	Mentor(){
		System.out.println("Im parent constructor");
	}
}
public class Student extends Mentor {
     
	Student(){
		super();
		System.out.println("Im child constructor");
	}
	public static void main(String[] args) {
		Student s1=new Student();

	}

}
