import java.util.ArrayList;
public class Movie
{
	static ArrayList<String> mov = new ArrayList<String>();
	static ArrayList<String> des = new ArrayList<String>();
	
	static String movieTitle;
	private String pubYear;
	private String rating;
	private String genre;
	static String desc;
	
	public Movie(String t, String y, String r, String g, String d)
	{
		movieTitle = t;
		pubYear = y;
		rating = r;
		genre = g;
		desc = d;
	}
	public static void main(String[] args) 
	{	
		Movie m1 = new Movie("Big Hero 6", "2014", "PG", "Family", "When a criminal plot threatens the hi-tech metropolis of San Fransokyo,\n"
				+ "brilliant young robotics whiz Hiro Hamada leaps into action with his tech-savvy friends,\n"
				+ "and his robot companion Baymax in Disney Animation's adaptation of the popular Marvel Comics series...");
				
		mov.add(m1.toString());
		des.add(desc);
		
		Movie m2 = new Movie("Home Alone", "1990", "PG", "Comedy", "An eight-year-old troublemaker must protect his house from a pair of burglars\n"
				+ "when he is accidentally left home alone by his family during Christmas vacation.");
				
		mov.add(m2.toString());
		des.add(desc);
		
		Movie m3 = new Movie("The Avengers", "2012", "PG-13", "Action", "When the Tesseract, a cube of pure energy with the power to destroy the Earth,\n"
				+ "is stolen by the nefarious God of Mischief, Loki, S.H.I.E.L.D. leader Nick Fury embarks on\n"
				+ "a daring recruitment effort spanning theglobe to assemble a team of the world’s most powerful superheroes to get it back.\n"
				+ "Captain America, Iron Man, Thor, Black Widow, Hawkeye and The Hulk are brought together to stop Loki.\n"
				+ "But unfortunately, it’ll take more than just assembling them to save the world from the brink of destruction.");
		
		mov.add(m3.toString());
		des.add(desc);
		
		Movie m4 = new Movie("Top Gun: Maverick", "2022", "PG-13", "Action", "After thirty years, Maverick is still pushing the envelope as a top naval aviator, but must confront\n"
				+ "ghosts of his past when he leads TOP GUN's elite graduates on a mission that demands the ultimate sacrifice\n"
				+ "from those chosen to fly it.");
		
		mov.add(m4.toString());
		des.add(desc);
		
		Movie m5 = new Movie("Mission: Impossible", "1996", "PG-13", "Thriller", "Ethan Hunt (Tom Cruise) is a Secret Agent framed for the deaths of his espionage team.\n"
				+ "Fleeing from government assassins, breaking into the C.I.A.'s most impenetrable vault, clinging to the roof of a\n"
				+ "speeding bullet train, Hunt races like a burning fuse to stay one step ahead of his pursuers and draw one step closer\n"
				+ "to discovering the shocking truth.");

		mov.add(m5.toString());
		des.add(desc);
	
		
	}
	
	public String toString()
	{
		return movieTitle + " (" + pubYear + ") - " + rating + " - " + genre;
	}
}

