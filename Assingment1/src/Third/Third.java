package Third;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter principal");
		int p=sc.nextInt();
		System.out.println("Enter rate");
		int r=sc.nextInt();
		System.out.println("Enter time");
		int t=sc.nextInt();
		int n=1;  //considering compounded yearly
		
		int sI = (p*r*t)/100;
		double amount = p * Math.pow(1 + (r / n), n * t);
	    double cI = amount - p;
		
		System.out.println("Simple Interest is "+sI);
		System.out.println("Compound Interest is "+cI);
		
	}

}
