package Second;

import java.util.Scanner;

public class Labour extends Employee {
	int overTime;
	int perHour;

	public Labour(String name, int employeeId, int departmentId, int basicPay) {
		super(name, employeeId, departmentId, basicPay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalSalary() {
		System.out.println("Enter No, of hours of Over Time for  labour " + name);
		Scanner sc = new Scanner(System.in);
		this.overTime = sc.nextInt();
		System.out.println("Enter Per hour Wage for OT");
		this.perHour = sc.nextInt();
		int totalPay = this.basicPay + (perHour * overTime);
		System.out.println("I am a labour my total income is :" + totalPay);
	}

}
