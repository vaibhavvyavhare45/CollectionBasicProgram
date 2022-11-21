package collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetAscendingorder {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		h.add(89);
		h.add(45);
		h.add(8);
		h.add(2);
		h.add(48);
		System.out.println(h);
		List<Integer> l=new ArrayList<Integer>(h);
		Collections.sort(l);
		System.out.println(l);
	}

}
