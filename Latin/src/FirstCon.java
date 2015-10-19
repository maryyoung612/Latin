import java.util.Scanner;
public class FirstCon
	{
	public static String tense;
	public static void conjugateFirst()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Indicitive or Subjunctive?");
		tense = userInput.nextLine();
		if(tense.toUpperCase().equals("Indicitive"))
			{
			conIndic();
			}
		else if(tense.toUpperCase().equals("Subjunctive"))
			{
			conSubj();
			}
		else
			{
			System.out.println("What are you doing with your life? Redo it.");
			
			}
		}
	public static void conIndic()
		{
		System.out.println("Here are the active and passive indicitive conjugations of "+conjugating.dicti+","+conjugating.dicti2+","+conjugating.dicti3+","+conjugating.dicti4);
		conIndicPres();
		conIndicPas();
		}
	public static void conIndicPres()
		{
	
		}
	public static void conIndicPas()
		{
	
		}
	public static void conSubj()
		{
		System.out.println("Here are the active and passive subjunctive conjugations of "+conjugating.dicti+","+conjugating.dicti2+","+conjugating.dicti3+","+conjugating.dicti4);
		conSubjPres();
		conSubjPas();
		}
	public static void conSubjPres()
		{
	
		}
	public static void conSubjPas()
		{
	
		}
	}