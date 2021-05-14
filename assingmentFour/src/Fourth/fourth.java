package Fourth;

import java.util.ArrayList;
import java.util.List;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> string = new ArrayList<>();
		string.add("Naman");
		string.add("Aman");
		string.add("Raj");
		string.add("Mukesh");
		string.add("Manohar");
		string.add("Mridul");

		string.removeIf(n -> n.length() % 2 != 0);

		string.forEach(System.out::println);
	}

}
