import java.io.*;
class q16
{
	public static void main(String[] args)throws IOException 
    {
        int space,i,j,value=1;
		System.out.println("enter row no.");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

       for(i=0; i<n; i++)            // outer loop for displaying n
       {
          for(space=1; space <= n-i; space++)  // space for every row starting
            System.out.print(" ");
 
        for(j=0; j <= i; j++)     // inner loop for displaying the pascal triangle of numbers
        {
            if (j==0 || i==0)     // either outer loop value or inner-loop value is "0 " it prints 1
                value = 1;
            else
                value = value*(i-j+1)/j;  //calculate the coefficient
 
            System.out.print(value+" ");
        }
        System.out.println();
    }
 }
   
}