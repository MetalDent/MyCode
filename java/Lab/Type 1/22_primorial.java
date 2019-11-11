import java.io.*;
public class q22
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        int num=Integer.parseInt(br.readLine());
        long fact=1;
        for(int i=num;i>1;i--)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                fact=fact*i;
            }
        }
        System.out.println("Primorial of "+num+" is "+fact);
    }
}