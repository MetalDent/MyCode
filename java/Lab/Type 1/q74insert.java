import java.util.Scanner;
class q74insert
{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= obj.nextInt();
		int[] ar = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=obj.nextInt();
		}
		System.out.println("sorted the array elements");

		insertionSort(ar,n);
	}
	public static void insertionSort(int ar[], int n)
	{
		for(int j=1;j<n;j++)
		{
			int x= ar[j];
			int i=j-1;
			while(i>-1&& ar[i]>x)
			{
				ar[i+1]= ar[i];
				i--;
			}
			ar[i+1]=x;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}
}