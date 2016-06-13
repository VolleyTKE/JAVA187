package com.calcchange.cvg;

import java.util.Scanner;

public class CalcChange {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int h = 0;
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
		
		System.out.println("Welcome to the Change Calculator\n");
		String choice = getString(sc, "\nDo you have change (Y/N)? ");
		//choice = Validator.getString(sc, "\nDo you have more change (Y/N)? ");
		
		while(choice.equalsIgnoreCase("y"))	{
			//get input for coin amounts
			
			//System.out.println("How many coins do you have? ");
			//h = getInt(sc, "How many half-dollars do you have? ", 0)
			q = getInt(sc, "How many quarters do you have? ", 0);
			d = getInt(sc, "How many dimes do you have? ", 0);
			n = getInt(sc, "How many nickels do you have? ", 0);
			p = getInt(sc, "How many pennies do you have? ", 0);
			
			coinTotal(q,d,n,p);
			
			
			choice = getString(sc, "\nDo you have more change(Y/N)? ");
						
		}
		
		System.out.println("Thanks for using the Change Calculator!");
		
	}
	

	
	public static void coinTotal(/*int hd, */int qr, int dm, int ni, int pn)	{
		int dollars = 0;
		int cents = 0;
		int totalcents = 0;
		
		totalcents = /*(hd * 50) + */(qr * 25) + (dm * 10) + (ni * 5) + pn;
		dollars = totalcents / 100;
		cents = totalcents % 100;
		
		System.out.println("\nYou have a total of " + totalcents + " cents, which is "
		+ dollars + " "	+ pluralCash("dollar", dollars) + " and " 
				+ cents + " " + pluralCash("cent", cents) + ".");
		
	}
	
	public static String pluralCash(String currency, int numberofcoins)	{
		if(numberofcoins == 0)
			return currency;
		if(numberofcoins > 1)
			currency = currency + "s";
		return currency;
	}
	
	public static String getString(Scanner sc, String prompt)	{
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
//	Test MEthod to validate string input
//	public static String getString(Scanner sc, String prompt)	{
//		
//		boolean isValid = false;
//		String s = "";
//		
//		while(isValid == false){
//			System.out.print(prompt);
//			s = sc.next(); //read user input
//			if(s.equalsIgnoreCase("y") == true || s.equalsIgnoreCase("n") == true)	{
//				sc.nextLine(); //discard any other info on the line
//				isValid = true;
//			}
//			else 
//				System.out.println("INVALID INPUT! \"Y\" or \"N\" only." );
//				s = sc.nextLine();
//		}
//		return s;
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
	
	public static int getInt(Scanner sc, String prompt, int min)	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)	{
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be greater than " + min + ".");
			else
				isValid = true;
		}
		return i;
	}
	
	
	
}
