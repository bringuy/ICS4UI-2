//determine whether two adjacent elements of an array have a sum of 12
public class sumOf12 {

	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 10, 2};
		int i = 0;
		System.out.println(sumAdjacent(array, i));
	}

	public static boolean sumAdjacent(int[] array, int i) {
		if (i == array.length - 1)
			return false;
		else if (array[i] + array[i + 1] == 12)
			return true;
		else
			return sumAdjacent(array, i + 1);
	}
}
