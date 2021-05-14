package Seventh;

import java.util.ArrayList;
import java.util.List;

public class Parked_CarOwnerList {
	List<Parked_CarOwner_Details> list = new ArrayList<>();
	List<Integer> Tokens = new ArrayList<>();
	static int tokenNo = 0;

	public void add_new_car(Parked_CarOwner_Details obj) {
		list.add(obj);
		tokenNo += 1;
		Tokens.add(tokenNo);
		System.out.println("Car Added Sucessfully");
		System.out.println("Your Token Number is " + tokenNo);

	}

	public void remove(String regno, Object token) {
		int flag = 0;
		for (Parked_CarOwner_Details p : list) {
			if (p.getCarNo().matches(regno)) {
				flag = 1;
				list.remove(p);
				Tokens.remove(token);
				System.out.println("Car Removed Sucessfully");
			}
			break;
		}
		if (flag == 0)
			System.out.println("no cars found");

	}

	public void get_parked_car_location(int token) {
		int flag = 0;
		for (Integer i : Tokens) {
			if (i == token) {
				flag = 1;
				int n = token % 20;
				if (n == 0)
					n = 20;
				if (token <= 80) {
					System.out.println("First Floor");
					if (token <= 20)
						System.out.println("Segment First and slot " + n);
					if (token > 20 && token <= 40)
						System.out.println("Segment Second and slot " + n);
					if (token > 40 && token <= 60)
						System.out.println("Segment Third and slot " + n);
					if (token > 60 && token <= 80)
						System.out.println("Segment Fourth and slot " + n);

				}
				if (token > 80 && token <= 160) {
					System.out.println("Second Floor");
					if (token > 80 && token <= 100)
						System.out.println("Segment First and slot " + n);
					if (token > 100 && token <= 120)
						System.out.println("Segment Second and slot " + n);
					if (token > 120 && token <= 140)
						System.out.println("Segment Third and slot " + n);
					if (token > 140 && token <= 160)
						System.out.println("Segment Fourth and slot " + n);

				}
				if (token > 160) {
					System.out.println("Third Floor");
					if (token > 160 && token <= 180)
						System.out.println("Segment First and slot " + n);
					if (token > 180 && token <= 200)
						System.out.println("Segment Second and slot " + n);
					if (token > 200 && token <= 220)
						System.out.println("Segment Third and slot " + n);
					if (token > 220)
						System.out.println("Segment Fourth and slot " + n);

				}
			}
		}
		if (flag == 0)
			System.out.println("No Cars Found");
	}

}
