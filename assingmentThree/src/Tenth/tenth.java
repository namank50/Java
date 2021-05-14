package Tenth;

import java.util.Scanner;

public class tenth {

	public static void main(String[] args) {
		int input=1;
		Scanner sc = new Scanner(System.in);// TODO Auto-generated method stub
		while(input!=0) {
			System.out.println("Enter Choice 1.Add Movie 2.Remove Movie 3.Remove All Movies 4.Find Movies By Name 5.Find Movie By Genre");
			int Choice = sc.nextInt();
			Movie_DetailList m =new Movie_DetailList ();
			if(Choice==1) {
			m.addMovie();
			}
			if(Choice==2)
			{
				System.out.println("Enter Movie To be Removed");
				String remove = sc.next();
				m.remove_Movie(remove);
			}
			if(Choice == 3)
			{
				m.remove_AllMovies();
			}
			if(Choice==4) {
				System.out.println("Enter Name of the Movie");
				String name = sc.next();
				m.movie_by_name(name);
			}
			if(Choice==5) {
				System.out.println("Enter Name of the Genre");
				String genre = sc.next();
				m.movie_by_genre(genre);
			}
			System.out.println("Enter 1 to continue 0 to exit");
			input=sc.nextInt();
		}
	}

}
