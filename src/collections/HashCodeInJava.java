package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashCodeInJava {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("jon doe");
		hs.add("michale");
		hs.add(45);
		hs.add(56);
		hs.add(78);
		
		Iterator it=hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
