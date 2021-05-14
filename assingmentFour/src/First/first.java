package First;


public class first {
	@FunctionalInterface
	interface i{
		int addNumbers(int a,int b);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i add = (int a,int b)->a+b;
		System.out.println(add.addNumbers(3,4));
		i multiply = (int a,int b)->a*b;
		System.out.println(multiply.addNumbers(3, 4));
		i devide = (int a,int b)->a/b;
		System.out.println(devide.addNumbers(12, 5));
		i sub = (int a,int b)->a-b;
		System.out.println(sub.addNumbers(3, 4));

	}
}
