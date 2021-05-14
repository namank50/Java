package Seventh;

import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 100;
		Parked_CarOwnerList pl = new Parked_CarOwnerList();
		while (choice != 0) {
			System.out.println("Enter 1.To Add Car 2.Remove Car 3.Get Car Location");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter owner name");
				String name = sc.next();
				System.out.println("Enter Car Model");
				String model = sc.next();
				System.out.println("Enter Car Registration No.");
				String regno = sc.next();
				System.out.println("Enter Mobile No");
				Long n = sc.nextLong();
				System.out.println("Enter Address");
				String add = sc.next();
				Parked_CarOwner_Details p = new Parked_CarOwner_Details(name, model, regno, n, add);
				pl.add_new_car(p);
			}
			if (choice == 2) {
				System.out.println("Enter Registration Number of Car To be Removed");
				String regno = sc.next();
				System.out.println("Enter Token Number");
				int token = sc.nextInt();
				pl.remove(regno, token);
			}

			if (choice == 3) {
				System.out.println("Enter Token No. Allocated Between 1-240");
				int token1 = sc.nextInt();
				pl.get_parked_car_location(token1);
			}
			System.out.println("Enter 1 to continue 0 to Exit");
			choice = sc.nextInt();

		}
	}

}
