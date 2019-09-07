import java.util.Scanner; 

class pattern5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j > i ; j--) {
				System.out.print(" ");
			}

			for(int k = 1 ; k <= i ; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}