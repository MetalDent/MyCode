import java.util.*;

class q39
{
    public static void main(String arg[])throws InputMismatchException
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for a square matrix (between 3 and 10): ");
        int M = sc.nextInt();

        if(M <=3 || M >=10){

            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");

        }else{

            int a[][] = new int[M][M];
            int b[] = new int[M*M];
            int i, j, c, t;

            System.out.println("Enter " + (M*M) + " elements");

            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                    a[i][j] = sc.nextInt();

                }//loop j
            }//loop i

            System.out.println("\nORIGINAL MATRIX: ");
            c = 0;
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                    //print the elements of the original matrix
                     System.out.print(a[i][j]+ "   ");

                     //store the non-boundary elements in an array
                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                        b[c++] = a[i][j];

                }//loop j
                 System.out.println();
            }//loop i

            //sort the non-boundary elements in ascending order
            for(i = 0; i < c; i++){
                for(j = i+1; j < c; j++){

                    if(b[i] > b[j]){
                        t = b[i];
                        b[i] = b[j];
                        b[j] = t;
                    }
                }//loop j
            }//loop i


            c = 0;
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                     //store the sorted elements at the non-boundary indeces
                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                        a[i][j] = b[c++];

                }//loop j
            }//loop i

            System.out.println("\nREARRANGED MATRIX: ");
            //Display the rearranged matrix
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                     System.out.print(a[i][j]+ "   ");

                }//loop j
                 System.out.println();
            }//loop i


            System.out.println("\nDIAGONAL ELEMENTS: ");
            //Display the rearranged matrix's diagonal elements
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                    if( i == j || i+j == M-1)
                        System.out.print(a[i][j]+ "   ");
                    else
                     System.out.print("   ");

                }//loop j
                 System.out.println();
            }//loop i


        }

    }//end of main

}//end of class