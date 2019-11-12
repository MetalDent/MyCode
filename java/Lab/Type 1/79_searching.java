import java.util.Scanner;

class searching
{
	public static void	main(String args[])
	{
		char e;
		Scanner in= new Scanner(System.in);

		do
		{
		System.out.println("enter \n1-linear search\n2-binary search\n");
		int choice=in.nextInt();
		System.out.println("enter array size");
		int n=in.nextInt();
		
		System.out.println("enter the array elements");
			int ar[]=new int[n];

			for(int i=0;i<n;i++)
			{
					ar[i]=in.nextInt();
			}
			System.out.println("enter the number to be searched\n");
		int x=in.nextInt();
		switch(choice)
		{
			case 1: linear(ar,n,x);
			break;

			case 2:
					//System.out.println("here");
 				System.out.println("number found at index "+binary(ar,n,x));
			break;

			default: System.out.println("wrong choice!!");
		}
		System.out.println("Do you want to continue? [y/n]");
		e=in.next().charAt(0);
	}while(e=='y');
	}

	public static void linear(int ar[],int n, int x)
	{
		int f=0;

		for(int i=0;i<n;i++)
		{
			if(ar[i]==x)
			{	System.out.println("number found at index "+i);
		f++;
				break;
			}
		}
		if(f==0)
			System.out.println("number not found");
	}
	public static int binary(int ar[],int n, int x)
	{
		int low=0,end=n-1;
		int mid ;
		while(low<=end)
		{
					mid =(low+end)/2;
					if(ar[mid]>x)
						end=mid-1;		
					else if(ar[mid]<x)
						low= mid+1;
					else if( ar[mid]==x)
					{
						return mid;
					}
					
				}
		
		return -1;
		}
}