package First;

import java.util.TreeSet;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> tree_set = new TreeSet<>();
		tree_set.add(new Person(120, 45, "Raj"));
		tree_set.add(new Person(110, 35, "Ram"));
		tree_set.add(new Person(160, 65, "Nushrat"));
		tree_set.add(new Person(130, 65, "Kiran"));
		tree_set.add(new Person(105, 25, "Arzoo"));
		System.out.println("Sorted according to weight and in case of equal weight sorted according to height");
		for (Person element : tree_set)
			System.out.println(element);
	}

}
