import java.util.Scanner;

class duplicate_no
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = in.nextInt();
		int[] ar=new int[n];
		int sum=0;
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{	ar[i]=in.nextInt();
			sum+=ar[i];
		}
		System.out.println("the duplicate number from 1 to "+n+" is "+(sum-(n*(n-1)/2)));

	}
}