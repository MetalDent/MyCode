import java.util.Scanner;

class insertion_sort
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= in.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		System.out.println("Sorted array elements");

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