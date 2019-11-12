import java.io.*; 
import java.util.Scanner;

class diagonal { 
  
    static void printDiagonalSums(int [][]mat, int n) 
    { 
        int principal = 0, secondary = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
      
                if (i == j) 
                    principal += mat[i][j]; 
      
                if ((i + j) == (n - 1)) 
                    secondary += mat[i][j]; 
            } 
        } 
      
        System.out.println("Principal Diagonal:" + principal); 
                                      
        System.out.println("Secondary Diagonal:" + secondary); 
    } 
  
    static public void main (String[] args) 
    { 
        int n,c,d;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows/columns of matrix");
      n = in.nextInt();
 
      int matrix[][] = new int[n][n];
     
      System.out.println("Enter the elements of matrix");
 
      for (c = 0; c < n; c++)
         for (d = 0; d < n; d++)
            matrix[c][d] = in.nextInt();

                      
        printDiagonalSums(matrix, n); 
    } 
} 