import java.util.Scanner;

class longestPali {

	public static String findLongestPalindrome(String s) {
	if (s.isEmpty()) {
		return null;
	}
 
	if (s.length() == 1) {
		return s;
	}
 
	String longest = s.substring(0, 1);
	for (int i = 0 ; i < s.length() ; i++) {

		String temp = helper(s, i, i);
		if (temp.length() > longest.length()) {
			longest = temp;
		}
 
		temp = helper(s, i, i + 1);
		if (temp.length() > longest.length()) {
			longest = temp;
		}
	}
 
	return longest;
}
 
public static String helper(String s, int begin, int end) {
	while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
		begin--;
		end++;
	}
	
	return s.substring(begin + 1, end);
}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();

		String lp = findLongestPalindrome(s);

		System.out.println(lp);
	}
}