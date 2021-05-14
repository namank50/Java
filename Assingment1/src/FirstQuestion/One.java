package FirstQuestion;


import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int b=n;
		int sum=0;
		while(b>0) {
			int a = b%10;
			sum = sum +(a*a*a);
			b=b/10;
		}
		if(sum==n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong number");
	}

}
