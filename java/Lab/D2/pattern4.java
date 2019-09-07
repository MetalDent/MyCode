import java.util.Scanner; 

class pattern4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int t = 1;

		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j > i ; j--) {
				System.out.print(" ");
			}

			for(int k = 1 ; k <= i ; k++) {
				System.out.print(t);
				t++;
			}

			System.out.println();
		}
	}
}