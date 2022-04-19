package main;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// 1. Write a program that uses a for-loop to
		// loop through the numbers 1-10 and prints
		// out each number.

//		for(int i=1;i<11;i++) {
//			System.out.println(i);
//		}

		// 2. Write a program that uses a while loop
		// to loop through the numbers 0-100 in
		// increments of 10 and prints out each number.

//		int i = 1; 
//		while(i <= 100){ 
//			if(i % 10 == 0) System.out.println(i);  
//			i++; 
//		} 

		// 3. Write a program that uses a do-while-loop to
		// loop through the numbers 1-10 and prints
		// out each number.

//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 10);

		// 4. Write a program that uses a for-loop to loop
		// through the numbers 1-100. Print out each
		// number if is a multiple of 5, but do not print
		// out any numbers between 25 and 75. Use the
		// “continue” statement to accomplish this.

//		for (int i = 1; i <= 100; i++) {
//			if (i % 5 == 0) {
//				continue;
//			}
//			if (i < 25 || i > 75) {
//				System.out.println(i);
//			}
//		}

		// 5. Write a program that uses a for-loop to loop
		// through the numbers 1-100. Print out each
		// number if is a multiple of 5, but do not print
		// out any numbers greater than 50. Use the “break”
		// keyword to accomplish this.

//		for (int i = 1; i <= 100; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i);
//			}
//			if (i > 50) {
//				break;
//			}
//		}

		// 6. Write a program that uses nested for-loops to
		// output the following:
		// Week 1:
		// Day 1
		// Day 2
		// Day 3
		// Day 4
		// Day 5
		// Week 2:
		// Day 1
		// Day 2
		// Day 3
		// Day 4
		// Day 5

//		for (int i = 1; i <= 2; i++) {
//		System.out.println("Week " + i);
//		for (int j = 1; j <= 5; j++) {
//			System.out.println("Day "+ j);
//		}
//	}

		// 7. Write a program that returns all the available
		// palindromes within 10 and 200. The following
		// output will be produced:
		// 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111,
		// 121, 131, 141, 151, 161, 171, 181, 191,

		Scanner sc = new Scanner(System.in);
        int range1, range2;
        System.out.println("Enter a range in numbers(num1-num2):");
        range1 = sc.nextInt();
        range2 = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        System.out.println(range1 + " to " + range2 + " palindrome numbers are");
        for (int i = range1; i <= range2; i++) {
            num1 = i;
            num2 = 0;
            while (num1 != 0) {
                int rem = num1 % 10;
                num1 /= 10;
                num2 = num2 * 10 + rem;
            }

            if (i == num2)
                System.out.print(i + " ");
        }
        sc.close();

		// 8. Write a program that prints the Fibonacci Sequence
		// from 0 to 50. The following output will be produced:
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

//		int n = 50, firstTerm = 0, secondTerm = 1;
//
//		System.out.println("Fibonacci Series Upto " + n + ": ");
//
//		while (firstTerm <= n) {
//			System.out.print(firstTerm + ", ");
//
//			int nextTerm = firstTerm + secondTerm;
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//
//		}

		// 9. Write a program that nests a for-loop inside another.
		// Print out the inner and outer variable
		// (e.g., i or j) in the inner loop
		// (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
		
//		for (int i = 1; i <= 5; i++) {
//		System.out.println("Outer Loop " + i);
//		for (int j = 0; j <= 5; j++) {
//			System.out.println("Inner Loop: i: " + i + ", j: " + j);
//		}
//	}

	}

}
