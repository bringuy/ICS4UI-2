//reverse the characters in a string
public class reverse {

	public static void main(String[] args) {
		String word = "hello";
		System.out.println(reverseString(word));
	}

	public static String reverseString(String word) {

		if (word.isEmpty()) {
			return word;
		}
		return reverseString(word.substring(1)) + word.charAt(0);

	}
}
