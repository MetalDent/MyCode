import java.util.Scanner;
class numbers
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("enter\n1-for even digits\n2-for odd digits\nany other to exit");
		int choice= obj.nextInt();
		System.out.println("enter a number");
		int n=obj.nextInt();
		int r=0,noo=0,noe=0;
		while(n!=0)
		{
			r=n%10;
			if(r%2==0)
				noe++;
			else noo++;
			n/=10;
		}			
		switch(choice)
		{
			case 1:System.out.println("no.of even digits "+noe);
			break;
			case 2:
			System.out.println("no.of odd digits "+noo);
			break;
			default: System.exit(0);
		}
	}
}