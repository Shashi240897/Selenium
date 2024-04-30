package Collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionClassSet {

	public static void main(String[] args) {
		Set s1 = new TreeSet();
		s1.add(50);
		s1.add(60);
		s1.add(90);
		s1.add(89);
		s1.add(10);
		s1.add(90);
		s1.add(90);
		s1.add(null);
		System.out.println(s1);
	}

}
