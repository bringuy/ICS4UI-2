
//Determine if a value is found in an array (the array is NOT sorted)
public class Found {

	public static void main(String[] args) {
		int[] array = { 1, 5, 4, 3, 6 };
		int i = 0;
		int searchNum = 5;
		System.out.println(searchArray(array, i, searchNum));

	}

	public static boolean searchArray(int[] array, int i, int searchNum) {
		if (i == array.length - 1)
			return false;
		else if (array[i] == searchNum)
			return true;
		else
			return searchArray(array, i + 1, searchNum);
	}


}
