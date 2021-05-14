package Second;

import java.util.Scanner;

public class Manager extends Employee {
	int incentives;

	public Manager(String name, int employeeId, int departmentId, int basicPay) {
		super(name, employeeId, departmentId, basicPay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalSalary() {

		System.out.println("Enter Incetives for manager " + name);
		Scanner sc = new Scanner(System.in);
		this.incentives = sc.nextInt();
		int totalPay = this.basicPay + incentives;
		System.out.println("I am a manager my total income is :" + totalPay);
	}

}
