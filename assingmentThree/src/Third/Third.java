package Third;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Third {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("Canada");
		countries.add("India");
		countries.add("China");
		countries.add("England");
		ListIterator<String> itr = countries.listIterator(countries.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
