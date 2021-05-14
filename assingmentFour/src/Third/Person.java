package Third;

public class Person {
	String Fname;
	String Lname;
	Integer age;
	public String getFname() {
		return Fname;
	}
	public String getLname() {
		return Lname;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + "]";
	}
	public Person(String fname, String lname, Integer age) {
		super();
		Fname = fname;
		Lname = lname;
		this.age = age;
	}
	
	
}
