import java.util.Scanner; 

class shuffle_string {
	public static boolean interleaved(String F, String S, String T) {
		
		if (F.length() == 0 && S.length() == 0 && T.length() == 0) {
			return true;
		}

		if (T.length() == 0) {
			return false;
		}

		if (F.length() != 0 && T.charAt(0) == F.charAt(0)) {
			return interleaved(F.substring(1), S, T.substring(1));
		}

		if (S.length() != 0 && T.charAt(0) == S.charAt(0)) {
			return interleaved(F, S.substring(1), T.substring(1));
		}

		return false;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String F = in.nextLine();
		String S = in.nextLine();
		String T = in.nextLine();

		if (interleaved(F, S, T)) {
			System.out.println("Valid shuffle");
		} else {
			System.out.println("Invalid shuffle");
		}
	}
}