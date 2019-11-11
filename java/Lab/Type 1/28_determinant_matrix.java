import java.io.*;
class q27{
    public static void main(String[] args)throws IOException {
        
     
   int n, i, j;double d;
   int matrix[][]=new int[10][10];   
   System.out.println("Enter the size of the matrix:");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       n=Integer.parseInt(br.readLine());  
       System.out.println( "Enter the elements of the matrix:");
   for (i = 0; i < n; i++)
      for (j = 0; j < n; j++)
        matrix[i][j]=Integer.parseInt(br.readLine());  
   System.out.println("The entered matrix is:");
   for (i = 0; i < n; i++) {  
      for (j = 0; j < n; j++)
         System.out.print(matrix[i][j] +" ");
         System.out.println(" ");
   }
   d = determinant(matrix, n);
   System.out.println("Determinant of the matrix is "+ d );
  

}
public static double determinant( int matrix [][] ,int n) {   
   double det = 0;
   
   int submatrix[][]=new int[10][10];
   if (n == 2)
      return ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));
   else {
      for (int x = 0; x < n; x++) {
         int subi = 0; 
         for (int i = 1; i < n; i++) {
            int subj = 0;
            for (int j = 0; j < n; j++) {
               if (j == x)
                  continue;
                  submatrix[subi][subj] = matrix[i][j];
                  subj++;
            }
            subi++;
         }
         det = det + (Math.pow(-1, x) * matrix[0][x] * determinant( submatrix, n - 1 ));
      }
   }
   return det;
}
}