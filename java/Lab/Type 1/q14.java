import java.io.*;
class q14
{
	public static void main(String[] args)throws IOException 
    {
        int gcd=0,lcm,i;
        char c;
        do{
		System.out.println("enter your choice \n 1.LCM \n 2.HCF");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch=Integer.parseInt(br.readLine());
		System.out.println("Enter two numbers");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());;

		switch(ch)
		{
			case 2:
			 for(i=1; i <= a && i <= b; i++)
                {
                        
                    if(a%i==0 && b%i==0)
                    gcd = i;
                }

             System.out.println("G.C.D of "+a +"and" +b+"is " + gcd);
             break;
			case 1:
			
                   int  minMultiple = (a>b) ? a : b;
                   
                while(true)
               {
                    if( minMultiple%a==0 && minMultiple%b==0 )
                 {
                   System.out.println("The LCM of of "+a +"and" +b+"is " +minMultiple);
                     break;
                 }
                  ++minMultiple;
               }
               break;
               default:System.out.println("wrong choice");
		}
		System.out.println("Do you continue?(y/n)");
     c=(char) br.read();
	}while(c=='y');
	}
}