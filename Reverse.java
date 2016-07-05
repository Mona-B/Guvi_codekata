import java.util.Scanner;

/**
 * This class is used for string manipulation like reverse the order of the word
 * in a string
 * 
 * positive case tested - world is beautiful negative case tested - empty input
 * 
 * method - reverseWord * @author Mona.B
 * 
 */
public class Reverse {

	/**
	 * get input and check whether it is empty then reverse the word in a string
	 * 
	 * @param str
	 *            input String/Line
	 * @param delimter
	 *            Delimiter for String/Line
	 */
	public void reverseWord(String str, String delimter) {
		// checking whether string is null or empty
		if (!str.isEmpty() && str != null) {
			System.out.println("Entered the string is: " + str);
			String str1[] = str.split(delimter);
			// checking whether the string has space
			if (str1.length > 1) {
				String final1 = "";
				// order of the word is reversed
				for (int strLen = str1.length - 1; strLen >= 0; strLen--) {
					final1 += str1[strLen] + delimter;
				}
				System.out.println("The reverse of the word in String: " + final1);
			} else {
				System.out.println("Please enter more than one word");
			}
		} else {
			System.out.println("Entered String is empty");
		}
	}

	public static void main(String args[]) {
		// getting the input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the line");
		String input = scanner.nextLine();
		// creating an object and calling a method
		Reverse reverse = new Reverse();
		reverse.reverseWord(input, " ");

	}
}
