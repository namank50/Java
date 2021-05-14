package Seventh;

import java.util.Scanner;

public class seventh {
	/*
	 * firstly we need to add products before purchasing initial quatity is set to
	 * zero
	 */

	public static void main(String[] args) {
		DessertItem c = new Candy();
		DessertItem j = new Cookie();
		DessertItem k = new IceCream();
		int choice = 1;
		while (choice != 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Identity(Owner/Customer)");
			String Choice = sc.next();
			if (Choice.equalsIgnoreCase("Owner") || Choice.equalsIgnoreCase("Customer")) {
				if (Choice.equalsIgnoreCase("Owner")) {
					System.out.println("Enter Product(Candy/Cookies/IceCream)");
					String Item = sc.next();
					if (Item.equalsIgnoreCase("Candy") || Item.equalsIgnoreCase("Candy")
							|| Item.equalsIgnoreCase("Candy")) {
						System.out.println("Enter quantity to added");
						int quant = sc.nextInt();
						if (Item.equalsIgnoreCase("Candy"))
							c.setQuantity(quant);
						if (Item.equalsIgnoreCase("Cookies"))
							j.setQuantity(quant);
						if (Item.equalsIgnoreCase("IceCream"))
							k.setQuantity(quant);
					} else
						System.out.println("Sorry we don't have that product");
				}
				if (Choice.equalsIgnoreCase("Customer")) {
					System.out.println("Enter Product(Candy/Cookies/IceCream)");
					String Item = sc.next();
					if (Item.equalsIgnoreCase("Candy") || Item.equalsIgnoreCase("Candy")
							|| Item.equalsIgnoreCase("Candy")) {
						if (Item.equalsIgnoreCase("Candy"))
							c.getCost();
						if (Item.equalsIgnoreCase("Cookies"))
							j.getCost();
						if (Item.equalsIgnoreCase("IceCream"))
							k.getCost();
					} else
						System.out.println("Sorry we don't have that product");
				}
			} else
				System.out.println("Invalid Identity");
			System.out.println("Enter 1 to continue 0 to exit");
			choice = sc.nextInt();

		}
	}

}
