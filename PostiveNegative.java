package com;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * @Author Mona.B
 * 
 * This program is to check whether the value entered is positive or negative or zeros
 */
public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostiveNegative p = new PostiveNegative();// object of the class
		try {
			System.out.println("Enter the number:");
			Scanner scan = new Scanner(System.in);// get the input value
			int number = scan.nextInt();
			p.check(number);// function call to check the number is positive or
							// negative
		} catch (InputMismatchException exception) {
			System.out.println("Invalid input type");// exception if the value
														// entered is not
														// numeric
		}
	}

	public void check(int n) {
		if (n == 0) {
			System.out.println("zero is netural number");// check whether the
															// entered alue is
															// zero
		} else if (n < 0) {
			System.out.println(+n + " is the negative number");// check whether
																// the value is
																// negative
		} else {
			System.out.println(+n + " is the positive number");
		}
	}

}
