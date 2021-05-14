package Ninth;

import java.util.TreeSet;

public class ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<SavingAccount> accounts = new TreeSet<>(); // as tree set is used it will not allow duplicates
		accounts.add(new SavingAccount(10000, 1230, "Rohini", true));
		accounts.add(new SavingAccount(20000, 12593, "Raj", true));
		accounts.add(new SavingAccount(30000, 1253, "Rinki", true));
		accounts.add(new SavingAccount(40000, 1123, "Ritu", false));
		accounts.add(new SavingAccount(50000, 23, "Rishu", true));

		System.out.println("Sorted According to Account Id");
		accounts.forEach(System.out::println);
	}

}
