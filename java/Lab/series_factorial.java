import java.util.Scanner; 

class series_factorial {
	
	int fact(int x) {

		int fact = 1; 

		for(int i = x ; i > 0 ; i--) {
			fact *= i;
		}

		return fact;
	}

	public static void main(String[] args) {
		
		series_factorial ob = new series_factorial(); 

		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int sum = 0;

		for(int i = 1 ; i <= num ; i++) {

			sum += ob.fact(i);
		}

		System.out.println("Sum is " + sum);
	}
}