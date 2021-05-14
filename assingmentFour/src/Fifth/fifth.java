package Fifth;

import java.util.ArrayList;
import java.util.List;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = new ArrayList<>();
		s.add("India");
		s.add("Australia");
		s.add("France");
		s.add("America");
		s.add("USA");

		StringBuilder b = new StringBuilder("{");
		for (String a : s)
			b.append(a.charAt(0));
		b.append("}");

		System.out.println(b);

	}

}
