package Ninth;
import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		int sumA =0;
		int sumB =0;
		int sumC =0;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter marks in Subject A of student " +(i+1));
			a[i]=sc.nextInt();
			System.out.println("Enter marks in Subject B of student " +(i+1));
			b[i]=sc.nextInt();
			System.out.println("Enter marks in Subject C of student " +(i+1));
			c[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
			sumA+=a[i];
		for(int i=0;i<3;i++)
			sumB+=b[i];
		for(int i=0;i<3;i++)
			sumC+=c[i];
		System.out.println("Total scored by three students in subject A is:"+sumA+" average in subject A is: "+(sumA/3));
		System.out.println("Total scored by three students in subject B is:"+sumB+" average in subject B is: "+(sumB/3));
		System.out.println("Total scored by three students in subject C is:"+sumC+" average in subject C is: "+(sumC/3));
		for(int i=0;i<3;i++)
			{
			int sum=0;
			sum=a[i]+b[i]+c[i];
			System.out.println("Total scored student "+(i+1)+" in all three subjects is:"+sum+" average is: "+(sum/3));

			}


	}

}
