package Eight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		Iterator<Integer> itr = i.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			i.add(5);
		}
	}

}
