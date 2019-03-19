//Determine if a string is a palindrome
public class palindrome {

	public static void main(String[] args) {
		String word = "racecar";
		System.out.println(check(word, reverse(word)));

	}

	public static boolean check(String word, String reverse) {
		if (word.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}

	public static String reverse(String word) {
		if (word.length() <= 1)
			return word;
		else
			return reverse(word.substring(1)) + word.charAt(0);
	}
}
