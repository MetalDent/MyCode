import java.io.*; 
import java.util.Scanner;

class sum_array
{
	public static void main(String[] args) 
	{
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array");
        for (int j =0;j<n;j++){
            a[j] = in.nextInt();
        }
		int min = a[0];
		int max = a[0];

		for (int i = 1; i < n; i++)  
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

}