

import java.util.Arrays;

/**
 * This class is to find repeated value in a array
 * 
 * @author Mona.B
 *
 */
public class Repeated {
	public static void main(String[] args) {
		// predefined array
		int element[] = new int[] { 4, 6, 7, 1, 2, 3, 1, 4 };
		int count = 1;
		int element1;
		int element2;
		// check whether the array is empty or not
		if (element.length > 0) {
			// Array is sorted to find the duplicate
			Arrays.sort(element);
			for (int i = 0; i < element.length - 1; i++) {
				element1 = element[i];
				element2 = element[count];
				count++;
				// checks for the duplicate value
				if (element1 == element2) {
					System.out.println(element2);
				}
			}
		} else {
			System.out.println("Array is empty");
		}
	}
}
