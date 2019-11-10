import java.io.*; 

import java.util.Scanner;
public class q35 { 
    public static void main(String[] args) { 
        int n;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows/columns of matrix");
      n = in.nextInt();
        boolean[][] hadamard = new boolean[n][n];

        // initialize Hadamard matrix of order n
        hadamard[0][0] = true;
        for (int k = 1; k < n; k += k) {
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    hadamard[i+k][j]   =  hadamard[i][j];
                    hadamard[i][j+k]   =  hadamard[i][j];
                    hadamard[i+k][j+k] = !hadamard[i][j];
                }
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hadamard[i][j]) System.out.print("+1 ");
                else                System.out.print("-1 ");
            }
            System.out.println();
        }
    }

}
