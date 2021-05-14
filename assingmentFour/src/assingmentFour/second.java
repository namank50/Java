package assingmentFour;

import java.util.ArrayList;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		ArrayList<order> od = new ArrayList<>();
		od.add(new order(10000, "ACCEPTED"));
		od.add(new order(5000, "COMPLETED"));
		od.add(new order(80000, "COMPLETED"));
		od.add(new order(2000, "ACCEPTED"));
		od.add(new order(30000, "COMPLETED"));
		od.add(new order(50000, "REJECTED"));

		condition c = (o) -> {
			if (o.getPrice() > 10000 && ((o.getStatus().equalsIgnoreCase("Accepted"))
					|| (o.getStatus().equalsIgnoreCase("Completed")))) {
				System.out.println(o);
			}

		};
		System.out.println("Order price more than 10000 are");
		for (order o : od)
			c.con(o);

	}

	interface condition {
		void con(order o);
	}

}
