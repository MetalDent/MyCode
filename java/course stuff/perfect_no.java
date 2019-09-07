import java.util.Scanner; 

class perfect_no {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int sum = 1;

		for(int j = 2 ; j <= num/2 ; j++) {
			if(num%j == 0) {
				sum += j;
			}
		}

		if(sum == num)
			System.out.println("Perfect number!");

		else
			System.out.println("Not Perfect!");
	}
}