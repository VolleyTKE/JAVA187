package com.calcchange.cvg;

import java.util.Scanner;

public class Validator {

	public static String getString(Scanner sc, String prompt)	{
		System.out.print(prompt);
		String s = sc.next(); //read user input
		sc.nextLine(); //discard any other info on the line
		return s;
	}
	
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
			else if (i >= max)
				System.out.println("Error! Number must be less than " + max + ".");
			else
				isValid = true;
		}
		return i;
	}
}
