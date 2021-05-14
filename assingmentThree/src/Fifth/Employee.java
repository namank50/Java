package Fifth;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Integer salary;
	private String email;

	public Employee(Integer employeeId, String employeeName, Integer salary, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId="+employeeId+",EmployeetName="+employeeName+"Salary"+salary+"]";
		
	}

	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
