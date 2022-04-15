package main;

import java.util.Scanner;

public class operatorsNums {

//		//1.
//		// To convert integer to binary, 
//		// start with the integer in question 
//		// and divide it by 2 keeping notice of 
//		// the quotient and the remainder. 
//		// Continue dividing the quotient by 2 
//		// until you get a quotient of zero. 
//		// Then just write out the remainders 
//		// in the reverse order.
//		//1
//		//8
//		//33
//		//78
//		//787
//		//33,987
//		

    public static void main(String[] args) {
        // TODO Auto-generated method stub
           System.out.println("Enter a number to convert it to a binary: ");
            Scanner scanner = new Scanner(System.in);
            int getIntNum = scanner.nextInt();

            String getConvertedResult = convertIntToBinary(getIntNum);
            System.out.println("Converted Binary: " + getConvertedResult);
            scanner.close();

        }

        static String convertIntToBinary(int numInt) {
            if (numInt == 0)
                return "0";

            StringBuilder stringBuilder = new StringBuilder();

            while (numInt > 0) {
                int remainder = numInt % 2;
                stringBuilder.append(remainder);
                numInt /= 2;
            }

            stringBuilder = stringBuilder.reverse();
            return stringBuilder.toString();
        
			
        
    }

}
