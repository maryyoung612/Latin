import java.util.Scanner;
public class conjugating
	{
	public static String dicti;
	public static String dicti2;
	public static String dicti3;
	public static String dicti4;
		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the 1st dictionary entry for the word **Make sure to use a pronunciation symbol ");
			dicti = userInput.nextLine();
			System.out.println("Enter the 2nd dictionary entry for the word **Make sure to use a pronunciation symbol ");
			dicti2 = userInput.nextLine();
			System.out.println("Enter the 3rd dictionary entry for the word **Make sure to use a pronunciation symbol ");
			dicti3 = userInput.nextLine();
			System.out.println("Enter the 4th dictionary entry for the word **Make sure to use a pronunciation symbol ");
			dicti4 = userInput.nextLine();
			String getConju = dicti2.substring(dicti2.length()-4,dicti2.length()-1);
			if(getConju.equals("are"))
				{
				System.out.println("That is the first conjugation");
				}
			else if(getConju.equals("ere"))
				{
				System.out.println("That is the second conjugation");	
				}
			else if(getConju.equals("ere"))
				{
				System.out.println("That is the third conjugation");
				}
			else if(getConju.equals("ire"))
				{
				System.out.println("That is the fourth conjugation");
				}
			else
				{
				System.out.println("I have no idea what that is.");
				}
			}
	}