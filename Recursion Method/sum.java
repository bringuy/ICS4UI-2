//find the sum of an array of integers
public class sum {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		System.out.println(sumArray(array, i));
	}

	public static int sumArray(int[] array, int i) {
		if (i == array.length - 1)
			return array[i];
		else
			return array[i] + sumArray(array, i + 1);

	}

}
