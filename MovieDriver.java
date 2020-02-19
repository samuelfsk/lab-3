import java.util.Scanner;

public class MovieDriver 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String answer;
		do {


			Movie a = new Movie();
			System.out.println("enter the title of the movie: ");
			String b = input.nextLine();
			a.setTitle(b); 

			System.out.println("enter the rating of of the movie: ");
			String c = input.nextLine();
			a.setRating(c); 

			System.out.println("enter the number of tickets sold in theathers for this movie: ");
			int d = input.nextInt();
			a.setSoldTickets(d);

			System.out.println(a.toString());

			System.out.println("Do you want to continue? (Y/N)");
			answer=input.nextLine();
			answer=input.nextLine(); 
		}
		while(answer.equalsIgnoreCase("y"));
		
		System.out.println("GoodBye");

	}

}
