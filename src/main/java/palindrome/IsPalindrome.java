package palindrome;

public class IsPalindrome {
	public static boolean isPalindrome(String word) {
	    String reverse = new StringBuilder(word).reverse().toString();
	    return word.equals(reverse);
	}


}
