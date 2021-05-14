package Second;

public class Employee {
	String name;
	int employeeId;
	int departmentId;
	int basicPay;

	public Employee(String name, int employeeId, int departmentId, int basicPay) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.basicPay = basicPay;
	}

	public void totalSalary() {
		System.out.println("I am an employee my basic Salary is " + basicPay);
	}

}
