//Write a Java method to check if an input string is a 
//palindrome (Use String functions).

package assignmnet4;

public class Question4 {
	public static boolean isPalindrome(String str) {
		StringBuilder reversed = new StringBuilder(str).reverse();
		return str.equals(reversed.toString());
	}

	public static void main(String[] args) {
		String value = "MOM";
		if (isPalindrome(value)) {
			System.out.println(value + " is a palindrome string.");
		} else {
			System.out.println(value + " is not a palindrome string.");
		}
	}
}