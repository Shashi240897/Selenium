package Encaps;

class login{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class Encaps1 {

	public static void main(String[] args) {
		login l1=new login();
		l1.setEmail("sha@gmail.in");
		System.out.println(l1.getEmail());
	}

}
