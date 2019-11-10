import java.util.Scanner; 

class count_vowels {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		int len = str.length();

		int ctr = 0;
		for(int i = 0 ; i < len ; i++) {

			if(str.charAt(i) == ' ')
				ctr++;
		}

		int count[] = new int[ctr+1];

		int k = 0;
		for(int i = 0 ; i < len ; i++) {

			if((str.charAt(i) != ' ') && (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'))
				count[k]++;

			else if(str.charAt(i) == ' ')
				k++;
		}

		int l = count.length;
		for(k = 0 ; k < l ; k++)
			System.out.println("No of vowels in word" + (k+1) + " are " + count[k]);
	}
}