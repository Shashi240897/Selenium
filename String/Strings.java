package String;

public class Strings {

	public static void main(String[] args) {
		String name = "Shashi";
		int size=name.length();
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(size);
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('i'));
		System.out.println(name.equals("manish"));
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println();
		for(int i=size-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}

	}

}
