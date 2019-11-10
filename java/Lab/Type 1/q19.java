import java.io.*;
class q19
{
	public static void main(String[] args)throws IOException 
    {
        int d,m;
		System.out.println("enter date");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		d=Integer.parseInt(br.readLine());
		System.out.println("enter month");
        m=Integer.parseInt(br.readLine());
        if(m>=1 && m<=12)
        {
        	if((d>=1 && d<=31) && (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12))
        		System.out.println("date is valid");
        	else if((d>=1 && d<=30) && (m==4 || m==6 || m==9 || m==11))
        		System.out.println("date is valid");
            else if((d>=1 && d<=28) && ( m==2))
        		System.out.println("date is valid");
        	else
        		
        		System.out.println("day is invalid");
        }
        else

        		System.out.println("month is invalid");
     }

}     

