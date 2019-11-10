import java.io.*; 
import java.util.Scanner;
public class q37 { 

    static public void main (String[] args) 
    { 
        int n;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your option 1 for 1d to 2d and 2 for 2d to 1d");
      n = in.nextInt();
      switch(n){
          case 1:
            System.out.println("Enter the total no. of elements in array");
            int m = in.nextInt();
            int oned[] = new int[m];
            for (int c = 0; c < m; c++)
                oned[c] = in.nextInt();
            System.out.println("Enter the rows and column of matrix");
            int p = in.nextInt();
            int q = in.nextInt();
            monoToBidi(oned,p,q);
            break;
        case 2:
            System.out.println("Enter the rows and column of matrix");
            int s = in.nextInt();
            int t = in.nextInt();
            int twod[][] = new int[s][t];
            System.out.println("Enter the elements of matrix");
            for (int c = 0; c < s; c++){
                for(int d = 0; d < t; d++)
                    twod[c][d] = in.nextInt();
            }
            bidiToMono(twod);
            break;
      }
    } 
    public static int[][] monoToBidi( final int[] array, final int rows, final int cols ) {
        if (array.length != (rows*cols))
            throw new IllegalArgumentException("Invalid array length");
    
        int[][] bidi = new int[rows][cols];
        for ( int i = 0; i < rows; i++ )
            System.arraycopy(array, (i*cols), bidi[i], 0, cols);
        for (int c = 0; c < rows; c++){
                for(int d = 0; d < cols; d++)
                    System.out.print(" "+bidi[c][d]);
                System.out.println();
        }    
        return bidi;
    }
    public static int[] bidiToMono( final int[][] array ) {
        int rows = array.length, cols = array[0].length;
        int[] mono = new int[(rows*cols)];
        for ( int i = 0; i < rows; i++ )
            System.arraycopy(array[i], 0, mono, (i*cols), cols); 
        for (int i=0;i<mono.length;i++)
            System.out.print(" "+mono[i]);
            return mono;
    }
} 
