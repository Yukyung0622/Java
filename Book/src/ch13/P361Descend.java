package ch13;

import java.util.Comparator;

public class P361Descend implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		return c1.compareTo(o2)*(-1);
	}

}