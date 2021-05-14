package Seventh;

import java.util.Scanner;

public class IceCream extends DessertItem {
	static int quantity;
	int orderquantity;

	public void setQuantity(int quantity) {
		this.quantity = quantity+this.quantity;
		System.out.println("Added Sucessfully");

	}

	@Override
	void getCost() {
		// TODO Auto-generated method stub
		System.out.println("Units availabe are :" +this.quantity);
		System.out.println("Enter no. of units of Ice Cream Required");
		Scanner sc = new Scanner(System.in);
		this.orderquantity=sc.nextInt();
		if(this.orderquantity<quantity) {
		int Cost = this.orderquantity*5; //ice cream cost Rs 5  each
		System.out.println("Amount to be paid for Ice Creams is Rs. " +Cost);
		this.quantity=quantity-orderquantity;
		}	
		else
			System.out.println("Insufficient Units Available");
	}

}
