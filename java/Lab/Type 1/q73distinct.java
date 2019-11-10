import java.util.Scanner;
class q73distinct
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
				System.out.println("distinct array elements");

		for(int i =0;i<n;i++)
		{
			if(check(ar[i],ar,i))
				System.out.println(ar[i]);
		}

	}
	public static boolean check(int x,int ar[], int ind)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==x && i!=ind)
				return false;
		}	
		return true;
	}
}