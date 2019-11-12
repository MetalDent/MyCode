import java.util.Scanner;

class primorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=in.nextInt();
        long fact=1;
        for(int i=n;i>1;i--)
        {
            int ctr=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    ctr++;
                }
            }
            if(ctr==2)
            {
                fact=fact*i;
            }
        }
        System.out.println("Primorial of "+n+" is "+fact);
    }
}