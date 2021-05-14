package Tenth;

public class Movie_Details {

	String movie_name;
	String lead_Actor;
	String lead_Actress;
	String Genere;

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getLead_Actor() {
		return lead_Actor;
	}

	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}

	public String getLead_Actress() {
		return lead_Actress;
	}

	public void setLead_Actress(String lead_Actress) {
		this.lead_Actress = lead_Actress;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
	}

	public Movie_Details(String movie_name, String lead_Actor, String lead_Actress, String genere) {
		super();
		this.movie_name = movie_name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		Genere = genere;
	}

	@Override
	public String toString() {
		return "Movie_Details [movie_name=" + movie_name + ", lead_Actor=" + lead_Actor + ", lead_Actress="
				+ lead_Actress + ", Genere=" + Genere + "]";
	}

}
