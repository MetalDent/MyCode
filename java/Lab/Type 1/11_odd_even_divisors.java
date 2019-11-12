import java.util.Scanner;

class odd_even_divisors {
	static int nO, nE;
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n = in.nextInt();
		nO = nE = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n%i == 0) {
				if(i%2 == 0)
					nE++;
				else
					nO++;
			}
		}

		System.out.println("No.of odd divisors " + nO + "\nNo.of even divisors " + nE);
	}
}