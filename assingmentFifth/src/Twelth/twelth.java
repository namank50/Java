package Twelth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import assingmentFifth.Trader;

public class twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("Ram","Indore");
		Trader t2 = new Trader("Shyam","Pune");
		Trader t3 = new Trader("Kishore","Lucknow");
		Trader t4 = new Trader("Anand","Indore");
		Trader t5 = new Trader("Meenal","Delhi");
		Trader t6 = new Trader("Menakshi","Lucknow");
		Trader t7 = new Trader("Muskan","Indore");
		Trader t8 = new Trader("Kamla","Pune");
		Trader t9 = new Trader("Harshit","Lucknow");
		Trader t10 = new Trader("Prajwal","Indore");
		Trader t11 = new Trader("Pinki","Pune");
		Trader t12 = new Trader("Puneet","Dehradun");
		
		List <Trader> trader = new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		trader.add(t7);
		trader.add(t8);
		trader.add(t9);
		trader.add(t10);
		trader.add(t11);
		trader.add(t12);
		
		List<Trader> result = trader.stream().filter(s->s.getCity().matches("Indore")).collect(Collectors.toList());
		
		if(result.isEmpty())
			System.out.println("No traders based in Indore");
		else
			System.out.println("Some traders are based in Indore");
	}

}
