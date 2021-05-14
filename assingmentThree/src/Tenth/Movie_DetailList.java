package Tenth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie_DetailList {

	static List<Movie_Details> list = new ArrayList<>();
	String sortVariable;

	public void addMovie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String name = sc.next();
		System.out.println("Enter Actor name");
		String Actorname = sc.next();
		System.out.println("Enter Acteress name");
		String Acteressname = sc.next();
		System.out.println("Enter Genre name");
		String Genrename = sc.next();
		Movie_Details m = new Movie_Details(name, Actorname, Acteressname, Genrename);
		list.add(m);
		System.out.println("Added Succesfully Details after addtion:");
		for (Movie_Details m1 : list)
			System.out.println(m1);

	}

	public void remove_Movie(String name) {
		for (Movie_Details m : list) {
			if (m.getMovie_name().matches(name))
				list.remove(m);
			break;
		}
		System.out.println("After Removal is:");
		for (Movie_Details m : list)
			System.out.println(m);
	}

	public void remove_AllMovies() {
		list.removeAll(list);
		for (Movie_Details m1 : list)
			System.out.println(m1);
		System.out.println("All movies Removed");

	}

	public void movie_by_name(String name) {
		for (Movie_Details m : list)
			if (m.getMovie_name().matches(name))
				System.out.println(m);
	}

	public void movie_by_genre(String genre) {
		for (Movie_Details m : list)
			if (m.getGenere().matches(genre))
				System.out.println(m);
	}

}
