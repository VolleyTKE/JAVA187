import java.util.Scanner;

public class MakeChange {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int cents;
        
        System.out.println("Welcome to the Make change Calculator");
        
        //cents = getCents();
        
//        while(cents != 0)   {
//            makeChange(cents);
//            cents = getCents();
        }   //end of while
        
//        System.out.println("Thanks for using MakeChange");
		

//	}
	
	private static void makeChange(int cents) {
		
		
	}

//	public static int getCents()	{
//		int input = getInt(sc, "Change? (1-100, 0 = quit): ", 0, 103);
//		
//		if(input <= 100)
//		
//		return 
//		
//	}
	
	public static int getInt(Scanner sc, String prompt)	{
		int i = 0;
		boolean isValid = false;
		while(isValid == false)	{
			System.out.print(prompt);
			if(sc.hasNextInt())	{
				i = sc.nextInt();
				isValid = true;
			}
			else	{
				System.out.println("You must enter a non-negative integer. Please try again.");
			}
			sc.nextLine(); //discard bad input on line
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max)	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)	{
			i = getInt(sc, prompt);
			if (i <= min)
				System.out.println("Error! Number must be greater than " + min + ".");
			else if (i > max)
				System.out.println("Error! Number must be less than " + max + ".");
			else
				isValid = true;
		}
		return i;
	}

}
