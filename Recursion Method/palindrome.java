//Determine if a string is a palindrome
public class palindrome {

	public static void main(String[] args) {
		String word = "samantha";
		System.out.println(checkPalindrome(word));

	}

	public static boolean checkPalindrome(String word) {
		if (word.charAt(0) == (word.charAt(word.length() - 1)))
			return true;
		else if (word.charAt(0) != word.charAt(word.length() - 1))
			return false;
		else
			return checkPalindrome(word.substring(0) + word.substring(word.length() - 1));

	}
}
