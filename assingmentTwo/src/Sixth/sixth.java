package Sixth;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter where to store for database 1 and for file 2");
		int store = sc.nextInt();
		if (store == 1) {
			Persistance ob = new databasePersistance();
			ob.persist();
		}
		if (store == 2) {
			Persistance ob = new FilePersistance();
			ob.persist();
		}

	}

}
