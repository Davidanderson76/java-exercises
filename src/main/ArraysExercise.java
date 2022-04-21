package main;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercise {

	public static void main(String[] args) {
		// 1. Write a program that creates an array of integers with a length of 3.
		// Assign the values 1, 2, and 3 to the indexes.
		// Print out each array element.

//		ArrayList<Integer> arr = new ArrayList<Integer>(); 
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		for (int i : arr) {
//			System.out.println(i);
//		}
//
//		System.out.println(arr);

		// 2. Write a program that returns the middle element in an array.
		// Give the following values to the integer
		// array: {13, 5, 7, 68, 2} and produce the following output: 7

//		ArrayList<Integer> numbers1 = new ArrayList<Integer>(); 
//		numbers1.add(13);
//		numbers1.add(5);
//		numbers1.add(7);
//		numbers1.add(68);
//		numbers1.add(2);
//		
//		int mid = (numbers1.size() - 1) /2;
//		int answer = numbers1.get(mid);
//		System.out.println(answer);

		// 3. Write a program that creates an array of String type and
		// initializes it with the strings �red�, �green�, �blue� and �yellow�.
		// Print out the array length. Make a copy using the clone( ) method.
		// Use the Arrays.toString( ) method on the new array to verify that
		// the original array was copied.

//		String[] colors2 = {"red","green","blue","yellow"};
//		String[] copy = colors2.clone();
//		
//		System.out.println(Arrays.toString(copy));

		// 4. Write a program that creates an integer array with 5 elements (
		// i.e., numbers). The numbers can be any integers. Print out the
		// value at the first index and the last index using
		// length - 1 as the index. Now try printing the value at
		// index = length ( e.g., myArray[myArray.length ] ). Notice the type
		// of exception which is produced. Now try to assign a value to the array
		// index 5. You should get the same type of exception.

//		ArrayList<Integer> numbers11 = new ArrayList<Integer>();
//		numbers11.add(1);
//		numbers11.add(2);
//		numbers11.add(3);

//		System.out.println(numbers11.get(0));
//		System.out.println(numbers11.get(numbers11.size() -1));

//		int lastIndex = (numbers11.size() -1);
//		int finalIndex = numbers11.get(lastIndex);
//		
//		System.out.println(finalIndex);

		// 5. Write a program where you create an integer array with a length of 5.
		// Loop through the array and assign the value of the loop control variable
		// (e.g., i) to the corresponding index in the array.

//		ArrayList<Integer> numbers5 = new ArrayList<Integer>(); 
//		numbers5.add(13);
//		numbers5.add(5);
//		numbers5.add(7);
//		numbers5.add(68);
//		numbers5.add(2);
//		for(int i = 0; i < numbers5.size(); i++) {
//			
//		}

		// 6. Write a program where you create an integer array of 5 numbers. Loop
		// through the array and assign the value of the loop control variable
		// multiplied by 2 to the corresponding index in the array.

//		ArrayList<Integer> numbers6 = new ArrayList<Integer>(); 
//		numbers6.add(13);
//		numbers6.add(5);
//		numbers6.add(7);
//		numbers6.add(68);
//		numbers6.add(2);
//		
//		for(int i=0; i < numbers6.size(); i++){
//			int currentValue = numbers6.get(i);
//			System.out.println(currentValue);
//		}		

		// 7. Write a program where you create an array of 5 elements. Loop through
		// the array and print the value of each element, except for the middle (index
		// 2) element.

//		ArrayList<Integer> numbers7 = new ArrayList<Integer>(); 
//		numbers7.add(13);
//		numbers7.add(5);
//		numbers7.add(7);
//		numbers7.add(68);
//		numbers7.add(2);
//		
//		int mid2 = (numbers7.size() - 1) /2;
//		int answer1 = numbers7.get(mid2);
//		System.out.println(answer);

//		for(int i = 0; i< numbers7.size(); i++) {
//			if(i == mid2) {
//				continue;
//			}
//			System.out.println(numbers7.get(i));
//		}

		// 8. Write a program that creates a String array of 5 elements and swaps the
		// first element with the middle element without creating a new array.

//		ArrayList<String> words8 = new ArrayList<String>();
//		words8.add("wow");
//		words8.add("bool");
//		words8.add("Zool");
//		words8.add("nice");
//		words8.add("alright");
//
//		int mid3 = (words8.size() - 1) / 2;
//
//		String value1 = words8.get(mid3);
//		String value2 = words8.get(0);
//
//		words8.remove(0);
//		words8.remove(mid3);
//
//		words8.add(0, value1);
//		words8.add(mid3, value2);
//
//		System.out.println(words8);

		// 9. Write a program to sort the following int array in ascending
		// order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
		// print the smallest and the largest element of the array.
		// The output will look like the following:
		// Array in ascending order: 0, 1, 2, 4, 9, 13
		// The smallest number is 0
		// The biggest number is 13

//		int[] numberArray = { 4, 2, 9, 13, 1, 0 };
//		Arrays.sort(numberArray);
//		for (int sortedValue : numberArray)
//			System.out.println(sortedValue);
		

		// 10. Create an array that includes an integer, 3 strings, and 1 double. Print
		// the array.
		
//		Object[] arr = new Object[5];
//		arr[0] = new String("David");
//		arr[1] = new String("Ryan");
//		arr[2] = new String("Zayne");
//		arr[3] = new Integer(3);
//		arr[4] = new Double(30.30);
//		
//		System.out.println((String)arr[0]);
//		System.out.println((String)arr[1]);
//		System.out.println((String)arr[2]);
//		System.out.println((Integer)arr[3]);
//		System.out.println((Double)arr[4]);
		
		
	}

}
