package Fourth;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Subject Marks");
		int a=sc.nextInt();
		System.out.println("Enter Second Subject Marks");
		int b=sc.nextInt();
		System.out.println("Enter Third Subject Marks");
		int c=sc.nextInt();
		if(a>60&&b>60&&c>60)
			System.out.println("Passed");
		if((a>60&&b>60&&c<60)||(a>60&&b<60&&c>60)||(a<60&&b>60&&c>60))
			System.out.println("Promted");
		else
			System.out.println("Fail");





	}

}
