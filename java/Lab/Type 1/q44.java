import java.util.*;

 class q44
 {
public static void main(String args[])
throws InputMismatchException{
Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of rows (greater than 2 and less than 10) for the square matrix : ");
int m=scan.nextInt();

if(m<=2 || m>=10)
    System.out.println("SIZE OUT OF RANGE");

else{
int a[][]=new int[m][m];
int b[] = new int[m*m];
int i,j,ctr,c;

System.out.println("Enter "+(m*m)+" numbers for the matrix: ");
for(i=0;i < m;i++){
for(j=0;j < m;j++){
a[i][j] = scan.nextInt();
}//loop j
}//loop i

//Index counter for 1-d array b[]
ctr = 0;

//Display the original matrix and store elements of 
//2-d array a[] into 1-d array b[]

System.out.println("ORIGINAL MATRIX");

for(i=0;i < m;i++){
for(j=0;j < m;j++){
System.out.print(a[i][j] + " ");
b[ctr++] = a[i][j];
}//loop j
System.out.println();
}//loop i

c = m-1;
ctr = 0;

do{

    for(i=0; i < m; i++)
        a[i][c] = b[ctr++];

        c--;
}while(c >= 0);

System.out.println("MATRIX AFTER ROTATION");

for(i=0;i < m;i++){
for(j=0;j < m;j++){
System.out.print(a[i][j] + " ");
}//loop j
System.out.println();
}//loop i

System.out.println("Sum of the corner elements="+(a[0][0] + a[0][m-1] + a[m-1][0] + a[m-1][m-1]));
}//else

}//end of main
}//end of class