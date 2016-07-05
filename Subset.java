
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
		int[] a1 = { 1, 2, 3 };
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < a1.length; index++) {
			intList.add(a1[index]);
		}
		// Array2 is converted into a list
		int[] a2 = { 2, 3 };
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		for (int index = 0; index < a2.length; index++) {
			intList1.add(a2[index]);
		}
		// checks whether elements in list are all present in another list
		if (intList.containsAll(intList1)) {
			System.out.println("a2 is the subset of a1");
		} else {
			System.out.println("a2 is not the subset of a1");
		}
	}
}
