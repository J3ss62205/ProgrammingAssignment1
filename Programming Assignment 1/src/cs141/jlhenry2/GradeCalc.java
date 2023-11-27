//Name: Jessica Henry
//Project: Programming Assignment #1 
//Description: This code will calculate the average of 5 grades and turn that into a grade. I used if and if else statements to create the code.
// The program gets the input of the 5 grades which are all doubles. The output is the average of the 5 grades!
package cs141.jlhenry2;

import java.util.Scanner;

/**
 * @author jlhenry2
 *
 */
public class GradeCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		double grade1;
		double grade2; 
		double grade3; 
		double grade4;
		double grade5;
		double avg = 0;
		//all the doubles and variables!!!
		System.out.println("My name is Jessica Henry");
		System.out.println("Program 2: Calculating the average of grades");
		System.out.println("------------------------");
		System.out.println("You just got five grades back! Now you want to know what the average of what the grades are...");
		System.out.println("What was the score on your first grade?(1-100)");
		grade1 = scnr.nextDouble();
		System.out.println("What was the score on your second grade?");
		grade2 = scnr.nextDouble();
		System.out.println("What was the score on your third grade?");
		grade3 = scnr.nextDouble();
		System.out.println("What was the score on your fourth grade?");
		grade4 = scnr.nextDouble();
		System.out.println("What was the score on your fifth grade?");
		grade5 = scnr.nextDouble();
		//This gets all 5 of the inputs!!!
		
		avg = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
		// This calcuates the average of the 5 inputs 
		
		if(avg < 60 && avg >= 0) {
			System.out.println("------------------------");
			System.out.println("Try better next time");
			System.out.println("Your grade is: F");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 70) {
			System.out.println("------------------------");
			System.out.println("You're so close");
			System.out.println("Your grade is: D");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 80) {
			System.out.println("------------------------");
			System.out.println("Don't give up");
			System.out.println("Your grade is: C");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 90) {
			System.out.println("------------------------");
			System.out.println("Keep up the hard work!");
			System.out.println("Your grade is: B");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg >= 90 && avg <= 100) {
			System.out.println("------------------------");
			System.out.println("AMAZING!!!");
			System.out.println("Your grade is: A");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		
		//This figures out the grade of the average - JH
		
		

	}

}

