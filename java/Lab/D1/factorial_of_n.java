import java.util.Scanner; 

class factorial_of_n {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int fact = 1; 

		for(int i = num ; i > 0 ; i--) {
			fact *= i;
		}

		System.out.println("Factorial of " + num +" is " + fact);
	}
}