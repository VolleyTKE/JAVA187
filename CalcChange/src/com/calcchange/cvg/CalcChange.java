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
		String choice = Validator.getString(sc, "\nDo you have change (Y/N)? ");
		//choice = Validator.getString(sc, "\nDo you have more change (Y/N)? ");
		
		while(choice.equalsIgnoreCase("y"))	{
			//get input for coin amounts
			
			//h = getCoin();
			//q = getCoin()
			
		}
		

	}
	
	public int getCoin(String cointype)	{
		int c = 0;
		
		return c;
		
	}

	public static void coinTotal(int qr, int dm, int ni, int pn)	{
		int dollars = 0;
		int cents = 0;
		int totalcents = 0;
		
		totalcents = (qr * 25) + (dm * 10) + (ni * 5) + pn;
		dollars = totalcents / 100;
		cents = totalcents % 100;
		
	}
}
