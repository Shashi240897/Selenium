package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_one {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add('c');
		a1.add("shashi");
		a1.add(true);
		a1.add(5.23);
		a1.add(10);
		a1.remove("shashi");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(50);
		a2.add(-30);
		a2.add(100);
		a2.addAll(a1);
		Collections.sort(a2);
		System.out.println(a2);
		
		List a3 = new ArrayList();
		a3.add(200);
		a3.add(500);
		a3.add(600);
		//a3.add(null);
		//a3.add(null);
		a3.add(200);
		a3.add(200);
		System.out.println(a3);
	}

}
