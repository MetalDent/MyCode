import java.util.Scanner; 

class magic_square { 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int a[][] = new int[n][n];

		int r = n-1;
        int c = n/2;
        a[r][c] = 1;

        for(int i = 2; i <= n*n; i++) {
            if (a[(r + 1) % n][(c + 1) % n] == 0) {
                r = (r + 1) % n;
                c = (c + 1) % n;
            }
            else {
                r = (r - 1 + n) % n;
            }
            a[r][c] = i;
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
	
	}
 
} 