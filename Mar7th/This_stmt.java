package Mar7th;

public class This_stmt {
	
	int a;
	String name1;
	
	void stmt(int b, String name) {
		System.out.println("my details");
		System.out.println(this.a=b);
		System.out.println(this.name1=name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         This_stmt s1=new This_stmt();
         s1.stmt(10, "shashi");
         
	}

}
