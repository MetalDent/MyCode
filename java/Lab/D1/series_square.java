import java.util.Scanner; 

class series_square {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int sum = 0;

		for(int i = 1 ; i <= num ; i++) {

			sum += Math.pow(i, 2);
		}

		System.out.println("Sum is " + sum);
	}
}