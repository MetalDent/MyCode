import java.util.Scanner; 

class series_fraction {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		double sum = 0.0;

		for(double i = 1 ; i <= num ; i++) {

			sum += (i/(i+1));
		}

		System.out.println("Sum is " + sum);
	}
}