package assingmentFour;

import java.util.ArrayList;
import java.util.List;

public class sixth {
	public static void main(String[] args) {

		List<String> string = new ArrayList<>();
		string.add("Naman");
		string.add("Aman");
		string.add("Raj");
		string.add("Mukesh");
		string.add("Manohar");
		string.add("Mridul");

		string.replaceAll(n -> n.toUpperCase());

		string.forEach(System.out::println);

	}

}
