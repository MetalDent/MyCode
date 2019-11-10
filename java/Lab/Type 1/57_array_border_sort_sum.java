import java.util.*; 

class array_border_sort_sum {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();

		int a[][] = new int[m][m];
		int sum = 0;
		Integer bArray[] = new Integer[m*m];

		for(int i = 0 ; i < m ; i++)
			for(int j = 0 ; j < m ; j++)
				a[i][j] = in.nextInt();

		// Make an array of border elements
		int k = 0;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < m ; j++) {
					
				if((i > 0 && i < m-1) && (j > 0 && j < m-1)) {
					bArray[k] = 0;
					k++;
				}

				else {
					bArray[k] = a[i][j];
					sum += bArray[k];
					k++;
				}
			}
		}

		Arrays.sort(bArray, Collections.reverseOrder());

		System.out.println("ORIGINAL MATRIX:");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		// Change border elements
		k = 0;
		for(int i = 0 ; i < m ; i++) {

			a[0][i] = bArray[k];
			k++;
		}
		for(int i = 1 ; i < m ; i++) {

			a[i][m-1] = bArray[k];
			k++;
		}
		for(int i = m-2 ; i > -1 ; i--) {

			a[m-1][i] = bArray[k];
			k++;
		}
		for(int i = m-2 ; i > 0 ; i--) {

			a[i][0] = bArray[k];
			k++;
		}

		System.out.println("REARRANGED MATRIX:");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("Sum of border elements: " + sum);

	}
}