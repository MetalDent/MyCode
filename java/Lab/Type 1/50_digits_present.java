import java.util.Scanner; 

class digits_present {
	
	public static boolean isDigitsPresent(String str) {

		int len = str.length();

		for(int i = 0 ; i < len ; i++) {

			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		if(isDigitsPresent(str))
			System.out.println("Digits are present");
		else
			System.out.println("Digits are not present");
	}	
}