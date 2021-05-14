package Eight;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		List<Integer> i = new CopyOnWriteArrayList<>();
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
