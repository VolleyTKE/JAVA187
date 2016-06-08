package com.calcchange.cvg;

import java.util.Scanner;

public class CalcChange {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Change Calculator\n");
		String choice = Validator.getString(sc, "\nDo you have change (Y/N)? ");
		choice = Validator.getString(sc, "\nDo you have more change (Y/N)? ");
		

	}

}
