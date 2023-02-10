import java.util.ArrayList;
import java.util.Scanner;

public class NetflixMovieList
{

	public static void main(String[] args){
		// Set-up
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		Movie.main(args);
		
		// Create ArrayList with Movie Info. using Movie class
		for (int i = 0; i < Movie.mov.size(); ++i)
		{
			list.add(Movie.mov.get(i));
		}
		
		// Stores user-input name and movie amount
		String name = "";
		int amount = 0;
		
		// Prompts User
		System.out.print("Welcome to Netflix!\nEnter your name: ");
		name = s.next();
		System.out.print("How many movies would you like to display (3 – 5): ");
		amount = s.nextInt();
		System.out.println("-----------------");
		System.out.println("Welcome, " + name + "!");
		System.out.println("-----------------");
		
		// Prints out the number of movies the user desired
		if (amount > 5)
		{
			System.out.print("Error: Try Again!");
		}
		else 
		{			
			repeat(list, amount);	
		}	
	}

	public static void repeat(ArrayList<String> list, int amount)
	{
		// Set-up
		Scanner s = new Scanner(System.in);
		ArrayList<String> fav = new ArrayList<String>();
		int loop = 0;
			
		// While-loop for infinite prompts until user inputs "X"
		while (loop == 0)
		{
			// Prompts user the option menu
			System.out.print("Movie Options:\n");	
			System.out.println("-----------------");
			for (int i = 1; i <= amount; i++)
			{		
				System.out.println(i + ".  " + list.get(i - 1));
			}
			System.out.println("-----------------");
			System.out.println("Select an Option:");
			System.out.println("> to scroll forward");
			System.out.println("< to scroll backward");
			System.out.println("D to display all");
			System.out.println("F to display favorites");
			System.out.println("M to select a movie");
			System.out.println("A to add a movie to the list");
			System.out.println("R to remove a movie from the list");
			System.out.println("X to exit");
			System.out.println("------------------");	
			System.out.print("Please enter your selection: ");	
			// Stores user-input
			String check = s.next();
			
			// If-statements for each command when inputed			
			if (check.equals("D"))
			{		
				// Displays all 5 movie selections
				for (int i = 1; i <= list.size(); i++)
				{
					System.out.println(i + ".  " + list.get(i - 1));		
				}
				System.out.println("------------------");	
			}
			
			// Displays all favorite selections						
			if (check.equals("F"))
			{		
				System.out.println("Loading Favorites...");
				for (int i = 1; i <= fav.size(); ++i)
				{
					System.out.println(i + ".  " + fav.get(i - 1));
				}
				System.out.println("------------------");	
			}			
			
			if (check.equals("M"))
			{		
				// Prompts user to select a movie (1-5) 
				System.out.print("What movie would you like to select: "); 
				int movie = s.nextInt();
				System.out.println("------------------"); 
				System.out.println(list.get(movie - 1)); 
				// Searches for the respective movie's description
				for (int i = 1; i <= Movie.des.size(); ++i)
				{
					if (movie == i)
					{
						System.out.println(Movie.des.get(i - 1)); 
					}
				}
				System.out.println("-----------------");
				System.out.println("Select an Option:");
				System.out.println("F to add to favorites");
				System.out.println("W to watch");
				System.out.println("R to return to the movie list");
				System.out.println("X to exit");
				System.out.println("------------------");	
				System.out.print("Please enter your selection: ");	
				String check2 = s.next();		
				if (check2.equals("F"))
				{
					// Adds to Favorite List, stores the respective movie to the ArrayList
					System.out.print(Movie.mov.get(movie - 1) + ", Added to Favorites!\n");
					fav.add(Movie.mov.get(movie-1));
					System.out.println("------------------");	
				}
				if (check2.equals("W"))
				{
					// Plays the respective movie chosen by user
					System.out.print("Loading...\n\n");
					System.out.print("Enjoy, " + list.get(movie - 1) + "!");
					break;
				}
				if (check2.equals("R"))
				{
					// Redirects user back to Movie List and options
					System.out.println("Redirecting to Movie List...\nMovie Options:");
					for (int i = 1; i <= amount; i++)
					{		
						System.out.println(i + ".  " + list.get(i - 1));
					}
					System.out.println("------------------");	
				}
				if (check2.equals("X"))
				{
					// If inputed, end of program and stop loop
					System.out.print("Program Exited!");
					break;	
				}
			}		
			
			// Custom user input of a movie
			if (check.equals("A"))
			{							
				Scanner f = new Scanner(System.in);
				System.out.print("Movie Name: ");
				String movName = f.nextLine();
				System.out.print("Publish Year: ");
				String pubYear = f.nextLine();
				System.out.print("Rating: ");
				String rating = f.nextLine();
				System.out.print("Genre: ");
				String genre = f.nextLine();
				System.out.print("Description of Movie: ");
				String dom = f.nextLine();		
				// Sets user-created movie into movie list
				Movie dup = new Movie(movName, pubYear, rating, genre, dom);
				String t = dup.toString();
				Movie.des.add(dom);
				list.add(t);	
				System.out.println("------------------");	
			}		
			
			// Removes desired movie from the list
			if (check.equals("R"))
			{
				int amountOfMovies = list.size();
				System.out.print("Select movie to remove (1-" + amountOfMovies + "): ");
				list.remove(s.nextInt()-1);
				System.out.println("------------------");	
			}	
		
			if (check.equals(">"))
			{		
				// Scrolls forward once
				String temp = list.get(list.size() - 1);
				for (int i = list.size() - 1; i > 0; i--) 
				{
					list.set(i, list.get(i - 1));
				}
				list.set(0, temp);
				System.out.println("------------------");	
			}	
			
			if (check.equals("<"))
			{		
				// Scrolls backward once
				String temp = list.get(0);
				for(int i = 0; i < list.size() - 1; i++) 
				{
				    list.set(i, list.get(i + 1));
				}
				list.set(list.size() - 1, temp);
				System.out.println("------------------");	
			}	
				
			if (check.equals("X"))
			{
				// If inputed, end of program and stop loop
				System.out.print("Program Exited!");
				break;	
			}
		}
	}
}


	

