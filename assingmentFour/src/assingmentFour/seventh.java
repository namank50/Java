package assingmentFour;

import java.util.HashMap;
import java.util.Map;

public class seventh {
	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		StringBuilder mapString = new StringBuilder("{");
		for(Integer key:map.keySet()) {
			mapString.append(key+" = "+map.get(key)+", ");
		}
		mapString.delete(mapString.length()-2, mapString.length()).append("}");
		mapString.toString();
		
		System.out.println(mapString);
	
	
	}

}
