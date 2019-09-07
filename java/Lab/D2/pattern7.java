import java.util.Scanner; 

class pattern7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int k = 1;

		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i*2-1 ; j++) {
				System.out.print(k + " ");
				k += 2;
			}

			System.out.println();
		}
	}
}