import java.util.Scanner; 

class pattern6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		for(int i = 1 ; i <= num ; i++) {
			for(int j = i ; j < num ; j++) {
				System.out.print(" ");
			}

			for(int k = 1 ; k < i*2 ; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}