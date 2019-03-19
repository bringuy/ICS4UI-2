//Determine the number of occurrences of a value in an array
public class occurrences {
	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		int[] array = { 1, 2, 4, 5, 1, 4, 3, 4, 4 };
		int occurNum = 4;
		System.out.println(numOccur(array, i, count, occurNum));
	}

	public static int numOccur(int[] array, int i, int count, int num) {
		if (i == array.length)
			return 0;
		else if (array[i] == num) {
			return 1 + numOccur(array, i + 1, count, num);
		} else {
			return numOccur(array, i + 1, count, num);
		}
	}
}
