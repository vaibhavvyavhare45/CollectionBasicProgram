package collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDecendingOrderDemo {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet();
		h.add(45);
		h.add(78);
		h.add(100);
		h.add(90);
		System.out.println(h);
		ArrayList<Integer> al=new ArrayList<>(h);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}
