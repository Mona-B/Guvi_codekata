
import java.util.ArrayList;

/**
 * This class is used to find whether the array is subset of another array
 * 
 * @author Mona.B
 *
 */

public class Subset {
	public static void main(String args[]) {
		// Array1 is converted into a list
		int[] ints = { 1, 2, 3 };
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < ints.length; index++) {
			intList.add(ints[index]);
		}
		// Array2 is converted into a list
		int[] ints1 = { 2, 3 };
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		for (int index = 0; index < ints1.length; index++) {
			intList1.add(ints1[index]);
		}
		// checks whether elements in list are all present in another list
		if (intList.containsAll(intList1)) {
			System.out.println("Array2 is the subset of Array1");
		} else {
			System.out.println("Array2 is not the subset of Array1");
		}
	}
}
