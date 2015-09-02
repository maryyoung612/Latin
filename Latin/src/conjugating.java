import java.util.Scanner;
public class conjugating
	{
		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the second dictionary entry for the word");
			String dicti = userInput.nextLine();
			String end = dicti.substring(dicti.length()-3,dicti.length()-1);
			if(dicti.equals("are"))
				{
				System.out.println("That is the first conjugation");
				}
			else if(dicti.equals("re"))
				{
				System.out.println("That is the second conjugation");	
				}
			else if(dicti.equals("ere"))
				{
				System.out.println("That is the third conjugation");
				}
			else if(dicti.equals("ire"))
				{
				System.out.println("That is the fourth conjugation");
				}
			else
				{
				System.out.println("I have no idea what that is.");
				}
			}
	}