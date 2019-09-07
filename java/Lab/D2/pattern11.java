import java.util.Scanner; 

class pattern11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int k = 1;

		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				if(k%2 == 0) {
					System.out.print("-" + k + " ");
					k++;
				}
				
				else {
					System.out.print(k + " ");
					k++;
				}
			}

			System.out.println();
		}
	}
}