package com.Day8HW;

import java.util.Scanner;

import com.Day8.Car;

public class CreateAMonster {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean userFailed = false;
		String userInputString = null;
		int userInputInt = 0;
		MonsterClass yourOwnMonster = new MonsterClass();
		
		System.out.println("Welcome to the build your own monster workshop***");
		
		System.out.println("Please enter in your monster's name: ");
		String userInputName = sc.nextLine();
		yourOwnMonster.setName(userInputName);
		
		System.out.println("Please answer a series of questions to build out " + userInputName + ".");
		
		System.out.println("In a word, describe monster " + userInputName + "'s size?");
		userInputString = sc.nextLine();
		yourOwnMonster.setSize(userInputString);
		
		System.out.println("In a word, describe monster " + userInputName + "'s skin?");
		userInputString = sc.nextLine();
		yourOwnMonster.setTexture(userInputString);
		
		System.out.println("In a word, describe monster " + userInputName + "'s color?");
		userInputString = sc.nextLine();
		yourOwnMonster.setColor(userInputString);
		
		System.out.println("In a word, describe the type of monster that " + userInputName + " is (vampire, alien, whatever you like)?");
		userInputString = sc.nextLine();
		yourOwnMonster.setType(userInputString);
				
		do {
			System.out.println("How many eyes does " + userInputName + " ?");
			userInputString = sc.nextLine();
			userFailed = numberIsValid(userInputString);

		} while (userFailed);
		
		userInputInt = Integer.parseInt(userInputString);
		
		yourOwnMonster.setEyes(userInputInt);
		
		do {
			System.out.println("How many arms does " + userInputName + " have?");
			userInputString = sc.nextLine();
			userFailed = numberIsValid(userInputString);

		} while (userFailed);
		
		userInputInt = Integer.parseInt(userInputString);
		
		yourOwnMonster.setHorns(userInputInt);
		
		System.out.println("In a word non-plural word, describe how monster " + userInputName + " moves (fly, slither, crawl, amble, whatever you like)?");
		userInputString = sc.nextLine();
		yourOwnMonster.setMovement(userInputString);
		
		System.out.println("In a word/term, describe what power monster " + userInputName + " possesses?");
		userInputString = sc.nextLine();
		yourOwnMonster.setPower(userInputString);

		System.out.println("In a word, describe how monster " + userInputName + " uses his power?");
		userInputString = sc.nextLine();
		yourOwnMonster.setPowerDoes(userInputString);
		
		System.out.println("In a word, describe monster " + userInputName + " favorite prey?");
		userInputString = sc.nextLine();
		yourOwnMonster.setFood(userInputString);
		
		System.out.println(yourOwnMonster.toString());
		
	}
		
		public static boolean numberIsValid(String someStringToMakeANumber) {

			try {
				int aNumber = Integer.parseInt(someStringToMakeANumber);
				return false;
				
			} catch (NumberFormatException e) {
				return true;
			}

		}
}