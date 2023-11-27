//Name: Jessica Henry
//Project: Programming Assignment #1 
//Description:This code will use the given age and the given year to figure out how old you will be when you turn that age.
// The program gets the input from the user which are all ints. The output is the year that they will turn the specified age!
package cs141.jlhenry2;

import java.util.Scanner;

/**
 * @author jlhenry2
 *
 */
public class BirthdayWizard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		int yrBorn;
		int age; 
		int yrAge = 0;
		//all the ints and variables!!!
		System.out.println("My name is Jessica Henry");
		System.out.println("Program 1: Birthday Wizard");
		System.out.println("----------------------------------------------");
		System.out.println("You want to know what year you will turn a certin age ...");
		System.out.println("What year were you born?");
		yrBorn = scnr.nextInt();
		System.out.println("Choose an age in years:");
		age = scnr.nextInt();
		//This gets all of the inputs!!!
		
		yrAge = yrBorn + age;
		// This calcuates the year that it will be when you turn a specified age 
		System.out.println("----------------------------------------------");
		System.out.println("You will turn " + age + " in the year " + yrAge);
		System.out.println("----------------------------------------------");

		
		//This prints the solution to the input - JH
		
		

	}

}

