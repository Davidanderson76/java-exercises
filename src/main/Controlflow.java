package main;

import java.util.Scanner;

public class Controlflow {

	public static void main(String[] args) {

		// #1. Write a program that declares 1
		// integer variable x, and then assigns
		// 7 to it. Write an if statement to print
		// out “Less than 10” if x is less than 10.
		// Change x to equal 15 and notice the result
		// (console should not display anything).

//		int x = 7;
//		int x = 15;		
//		if(x < 10) {
//			System.out.println("Less than 10");
//		}

		// 2. Write a program that declares 1 integer
		// variable x, and then assigns 7 to it. Write
		// an if-else statement that prints out
		// “Less than 10” if x is less than 10 and
		// “Greater than 10” if x is greater than 10.
		// Change x to 15 and notice the result.

//		int x = 7;
//		int x = 15;
//		
//		if(x <10) {
//			System.out.println("Less than 10");
//		} else {
//			System.out.println("Greater then 10");
//		}

		// 3. Write a program that declares 1 integer
		// variable x, and then assigns 15 to it.
		// Write an “if-else-if” statement that prints
		// out “Less than 10” if x is less than 10,
		// “Between 10 and 20” if x is greater than 10
		// but less than 20, and “Greater than or equal
		// to 20” if x is greater than or equal to 20.
		// Change x to 50 and notice the result

//		int x = 15;
//		int x = 50;
//		
//		if(x < 10) {
//			System.out.println("Less than 10");
//		} else if (x>10 && x<20 ){
//			System.out.println("Between 10 and 20");
//		} else {
//			System.out.println("Greater than or equal to");
//
//		}

		// 4. Write a program that uses if-else-if statements
		// to print out grades A, B, C, D, F according to
		// the following criteria:
		// A: 90-100
		// B: 80-89
		// C: 70-79
		// D: 60-69
		// F: <60
		// Use the Scanner class to accept a number score from
		// the user to determine the letter grade. Print
		// out “Score out of range.” if the score is less
		// than 0 or greater than 100.

//		Scanner userInput = new Scanner(System.in);
//
//		System.out.println("Ayo, what's your score??");
//		int userScore = userInput.nextInt();
//
//		if (userScore >= 90) {
//			System.out.println("A");
//		} else if(userScore >= 80 && userScore <= 89){
//			System.out.println("B");
//		} else if(userScore >= 70 && userScore <= 79){
//			System.out.println("C");
//		} else if(userScore >= 60 && userScore <= 69){
//			System.out.println("D");
//		} else if(userScore < 60){
//			System.out.println("F");
//		} else {
//			System.out.println("Not a vallid test score!");
//		}
//
//		userInput.close();

		// 5. Write a program that accepts an integer
		// between 1 and 7 from the user. Use a
		// switch statement to print out the corresponding
		// weekday. Print “Out of range” if the number is
		// less than 1 or greater than 7. Don’t forget to
		// include “break” statements in each of your cases.

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Ayo, pick a number 1 -7??");
		int userDate = userInput.nextInt();
		
		int day = userDate;
		
				switch (day) {
				case 1:
					// code block
					System.out.println("Monday");
					break;
				case 2:
					// code block
					System.out.println("Tuesday");
					break;
				case 3:
					// code block
					System.out.println("Wednesday");
					break;
				case 4:
					// code block
					System.out.println("Thursday");
					break;
				case 5:
					// code block
					System.out.println("Friday");
					break;
				case 6:
					// code block
					System.out.println("Saturday");
					break;
				case 7:
					// code block
					System.out.println("Sunday");
					break;
				default:
					// code block
					System.out.println("OUT OF RANGE");
				}
		userInput.close();
	}

}
