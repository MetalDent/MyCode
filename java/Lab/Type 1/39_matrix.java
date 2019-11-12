import java.util.Scanner;

class matrix
{
    public static void main(String arg[])
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows for a square matrix (between 3 and 10): ");
        int M = in.nextInt();

        if(M <=3 || M >=10){

            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");

        }else{

            int a[][] = new int[M][M];
            int b[] = new int[M*M];
            int i, j, c, t;

            System.out.println("Enter " + (M*M) + " elements");

            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                    a[i][j] = in.nextInt();

                }
            }

            System.out.println("\nORIGINAL MATRIX: ");
            c = 0;
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                     System.out.print(a[i][j]+ "   ");

                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                        b[c++] = a[i][j];

                }
                 System.out.println();
            }

            for(i = 0; i < c; i++){
                for(j = i+1; j < c; j++){

                    if(b[i] > b[j]){
                        t = b[i];
                        b[i] = b[j];
                        b[j] = t;
                    }
                }
            }


            c = 0;
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                     if(i != 0 && j != 0 && i != M-1 && j != M - 1)
                        a[i][j] = b[c++];

                }
            }

            System.out.println("\nREARRANGED MATRIX: ");
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                     System.out.print(a[i][j]+ "   ");

                }
                 System.out.println();
            }


            System.out.println("\nDIAGONAL ELEMENTS: ");
            for(i = 0; i < M; i++){

                for(j = 0; j < M; j++){

                    if( i == j || i+j == M-1)
                        System.out.print(a[i][j]+ "   ");
                    else
                     System.out.print("   ");

                }
                 System.out.println();
            }


        }

    }

}