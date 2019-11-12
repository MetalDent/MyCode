import java.util.Scanner;

class non_leap_yr {
	public static void main(String[] args) {
        int d,m;
		System.out.println("Enter date");
        Scanner in = new Scanner(System.in);
		d = in.nextInt();
		System.out.println("Enter month");
        m = in.nextInt();
        if(m >= 1 && m <= 12)
        {
        	if((d>=1 && d<=31) && (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12))
        		System.out.println("Date is valid");
        	else if((d>=1 && d<=30) && (m==4 || m==6 || m==9 || m==11))
        		System.out.println("Date is valid");
            else if((d>=1 && d<=28) && ( m==2))
        		System.out.println("Date is valid");
        	else
        		
        		System.out.println("Day is invalid");
        }
        else

        		System.out.println("Month is invalid");
     }

}     

