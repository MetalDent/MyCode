import java.util.Scanner;

class numberType {
	
	static int n;
	public static void main(String args[]) {
		
		Scanner in= new Scanner(System.in);
		char e;

		do {
		System.out.println("Enter \n1-Armstrong Number \n2-Perfect Number \n3-Magic Number \n4-Palindrome Number \n5-Prime Number \nAny other to exit");
		
		int choice = in.nextInt();
		if(choice > 5 || choice <= 0)
			System.exit(0);
		
		System.out.println("Enter no: ");
		n = in.nextInt();
		switch(choice) {
			case 1: armstrong();
					break;

			case 2: perfect();
					break;

			case 3: magic();
					break;

			case 4: palindrome();
					break;

			case 5: if(prime())
						System.out.println("yes, "+ n+" is a prime number");
					else
						System.out.println("no, "+ n+" is not a prime number");

					break;

			default: System.exit(0);
		}

		System.out.println("Do you want to continue? [y|n]");
		e = in.next().charAt(0);
		}while(e == 'y');
		
	}

	public static void armstrong() {
		int r = 0, q = n, sum = 0;
		while(n != 0) {
			r = n%10;
			sum += r*r*r;
			n /= 10;
		}

		if(q == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");

	}

	public static void perfect() {
		int sum = 0;
		for(int i = 1 ; i < n ; i++)
		{
			if(n%i == 0)
				sum += i;
		}

		if(n == sum)
			System.out.println("Perfect number");
		else
			System.out.println("Not a Perfect number");

	}

	public static void palindrome() {
		int r = 0,q = n, sum = 0;
		
		while(n != 0) {
			r = n%10;
			sum = sum*10 + r;
			n /= 10;
		}

		if(q == sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome number");

	}

	public static boolean prime() {
		for(int i = 2 ; i < n ; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}	

	public static void magic() {

	}
}