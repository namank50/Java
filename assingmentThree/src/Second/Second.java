package Second;

import java.util.HashSet;
import java.util.Iterator;

public class Second {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("AB");
		set.add("BV");
		set.add("CH");
		set.add("DR");
		set.add("ER");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
