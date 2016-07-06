

import java.util.Scanner;

/**
 * This class finds the sum of the digit in a number and checks whether it is a
 * palindrome
 * 
 * @author Mona.B
 *
 */
public class SumOfDigit {
	public static void main(String args[]) {
		// getting the input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i = scanner.nextInt();
		int sum = 0, reverse = 0;
		int a, a1;
		// checks whether the number is zero
		// sum of the digits
		while (i != 0) {
			a = i % 10;
			sum = sum + a;
			i = i / 10;
		}
		System.out.println("Sum of the digit in the number : " + sum);
		int pal = sum;
		// reverse of the sum
		while (sum != 0) {
			a1 = sum % 10;
			reverse = (reverse * 10) + a1;
			sum = sum / 10;
		}
		System.out.println("Reverse of the sum of the digit in the number : " + reverse);
		// checks whether the sum is a palindrome
		if (pal == reverse) {
			System.out.println("The sum of the digits in a number is a palindrome");
		} else {
			System.out.println("The sum of the digits in a number is not a palindrome");

		}

	}

}
