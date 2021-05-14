package Sixth;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String savedUserName="Naman";
		String savedPassword="Password";
		System.out.println("Enter UserName");
		String inputUserName = sc.next();
		System.out.println("Enter Password");
		String inputpassword = sc.next();
		if((savedUserName.matches(inputUserName))&& (savedPassword.matches(inputpassword)))
			System.out.println("Welcome " +savedUserName);
		else
			System.out.println("Invalid Credentials");

	}

}
