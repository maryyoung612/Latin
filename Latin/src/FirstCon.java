import java.util.Scanner;
public class FirstCon
	{
	public static int tense;
	public static void conjugateFirst()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("(1)Indicitive or (2)Subjunctive?");
		tense = userInput.nextInt();
		if(tense==1)
			{
			conIndic();
			}
		else if(tense==2)
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
		System.out.println("Here are the active and passive indicitive conjugations of "+conjugating.dicti+", "+conjugating.dicti2+", "+conjugating.dicti3+", "+conjugating.dicti4);
		conIndicPres();
		conIndicPas();
		}
	public static void conIndicPres()
		{
		String getFEnding = conjugating.dicti2.substring(0,conjugating.dicti2.length()-3);
		System.out.println(getFEnding);
		System.out.println("Presnt Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Imperfect Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Future Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Perfect Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Pluperfect Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Future Perfect Active Tense");
		System.out.println(getFEnding+"o"+ "         "+getFEnding+"amus");
		System.out.println(getFEnding+"as"+ "        "+getFEnding+"atis");
		System.out.println(getFEnding+"at"+ "        "+getFEnding+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		}
	public static void conIndicPas()
		{
		String getFEnding = conjugating.dicti2.substring(conjugating.dicti2.length());
		System.out.println(getFEnding);
		}
	public static void conSubj()
		{
		System.out.println("Here are the active and passive subjunctive conjugations of "+conjugating.dicti+","+conjugating.dicti2+","+conjugating.dicti3+","+conjugating.dicti4);
		conSubjPres();
		conSubjPas();
		}
	public static void conSubjPres()
		{
		String getFEnding = conjugating.dicti2.substring(conjugating.dicti2.length()-4);
		System.out.println(getFEnding);
		}
	public static void conSubjPas()
		{
		String getFEnding = conjugating.dicti2.substring(conjugating.dicti2.length()-4);
		System.out.println(getFEnding);
		}
	}