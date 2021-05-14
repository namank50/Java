package Seventh;

import java.util.Scanner;

public class Cookie extends DessertItem {
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
		System.out.println("Enter no. of units of cookies required :");
		Scanner sc = new Scanner(System.in);
		this.orderquantity=sc.nextInt();
		if(this.orderquantity<quantity) {
		int Cost = this.orderquantity*1; //cookie cost 1 Euro each
		System.out.println("Amount to be paid for cookies is Euro " +Cost+ " and Rs. "+(70*Cost));
		this.quantity=quantity-orderquantity;
		}	
		else
			System.out.println("Insufficient Units Available");
	}
}
