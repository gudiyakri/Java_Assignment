//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {

		Integer[] a= { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> arr = Arrays.asList(a);

		Collections.shuffle(arr);

		arr.toArray(a);

		System.out.println(Arrays.toString(a));
	}
}