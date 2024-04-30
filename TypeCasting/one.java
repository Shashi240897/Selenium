package TypeCasting;

public class one {

	public static void main(String[] args) {
		String s="Selenium";
		char ch;
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			s1=s1+ch;
			
		}
		System.out.println(s1);
}
}
