import java.util.Scanner;

public class BT_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		String longestPalindromicSubstring = findLongestPalindromicSubstring(str);

		System.out.println("Longest palindromic substring: " + longestPalindromicSubstring);
	}

	public static String findLongestPalindromicSubstring(String str) {
		int n = str.length();
		int maxLength = 1;
		int start = 0;

		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int len = j - i + 1;
				if (len > maxLength && isPalindrome(str, i, j)) {
					maxLength = len;
					start = i;
				}
			}
		}

		return str.substring(start, start + maxLength);
	}

	public static boolean isPalindrome(String str, int start, int end) {
		while (start < end) {
			if (str.charAt(start++) != str.charAt(end--)) {
				return false;
			}
		}
		return true;
	}
}
