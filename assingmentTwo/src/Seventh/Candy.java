package Seventh;

import java.util.Scanner;

public class Candy extends DessertItem{
	
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
		System.out.println("Enter no. of units");
		Scanner sc = new Scanner(System.in);
		this.orderquantity=sc.nextInt();
		if(this.orderquantity<=quantity) {
		int Cost = this.orderquantity*2; //candy cost 2 dollar each
		System.out.println("Amount to be paid is Dollar " +Cost+ " and Rs. "+(60*Cost));
		this.quantity=quantity-orderquantity;
		}	
		else
			System.out.println("Insufficient Units Available");
	}
	
	

	
}
