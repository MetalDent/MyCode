import java.util.Scanner; 

class pattern9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		for(int i = num ; i >= 1 ; i--) {
			for(int j = i ; j < num ; j++) {
				System.out.print(" ");
			}

			for(int k = i*2 ; k > 1  ; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}