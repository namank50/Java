package Second;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Second1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new LinkedHashSet<>();
		set1.add("AB");
		set1.add("BB");
		set1.add("CD");
		set1.add("DF");
		set1.add("EG");
		Iterator<String> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
