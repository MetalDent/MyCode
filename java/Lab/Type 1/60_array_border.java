import java.util.Scanner; 

class array_border {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();
		int n = in.nextInt();

		int a[][] = new int[m][n];

		for(int i = 0 ; i < m ; i++)
			for(int j = 0 ; j < n ; j++)
				a[i][j] = in.nextInt();

		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {

				if((i > 0 && i < m-1) && (j > 0 && j < n-1))
					System.out.print("  ");

				else
					System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

	}
}