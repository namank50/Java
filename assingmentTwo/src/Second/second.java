package Second;

public class second {

	public static void main(String[] args) {
		System.out.println("Method of Employee Class called");
		Employee e = new Employee("raj", 253, 352, 10000);
		e.totalSalary();
		System.out.println("----------------------------------------------------------------------------");
		// TODO Auto-generated method stub
		System.out.println("Overridden Method of Manager Class called");
		Employee m = new Manager("naman", 123, 321, 10000);
		m.totalSalary();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Overridden Method of Labour Class called");
		Employee l = new Labour("Kishore", 555, 36, 5000);
		l.totalSalary();
		System.out.println("----------------------------------------------------------------------------");
	}

}
