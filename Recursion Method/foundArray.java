import java.util.Arrays;

//Determine if a value is found in an array (the array IS sorted)
public class foundArray {

	public static void main(String[] args) {
		int[] array = { 1, 3, 7, 4, 1, 9 };
		int i = 0;
		int findNum = 7;
		System.out.println(foundArraySort(array, i, findNum));

	}

	public static boolean foundArraySort(int[] array, int i, int num) {
		Arrays.sort(array);
		if (i == array.length - 1) {
			return false;
		} else if (array[i] == num) {
			return true;
		} else
			return foundArraySort(array, i + 1, num);
	}
}
