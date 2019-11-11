import java.util.Scanner;
class q78duplicate
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = obj.nextInt();
		int[] ar=new int[n];
		int sum=0;
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{	ar[i]=obj.nextInt();
			sum+=ar[i];
		}
		System.out.println("the duplicate number from 1 to "+n+" is "+(sum-(n*(n-1)/2)));

	}
}