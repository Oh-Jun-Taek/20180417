import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] array = { 20, 10, 40, 50, 30 };
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}

