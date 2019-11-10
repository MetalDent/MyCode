import java.util.Scanner;
class search79
{
	public static void	main(String args[])
	{
		char c;
		Scanner obj= new Scanner(System.in);

		do
		{
		System.out.println("enter \n1-linear search\n2-binary search\n");
		int choice=obj.nextInt();
		System.out.println("enter array size");
		int n=obj.nextInt();
		
		System.out.println("enter the array elements");
			int ar[]=new int[n];

			for(int i=0;i<n;i++)
			{
					ar[i]=obj.nextInt();
			}
			System.out.println("enter the number to be searched\n");
		int x=obj.nextInt();
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
		c=obj.next().charAt(0);
	}while(c=='y');
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
						//System.out.println("number found at "+low);
						return mid;
					}
					
				}
		
		return -1;
		}
}