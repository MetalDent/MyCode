import java.io.*; 

import java.util.Scanner;
public class q36
{
	public static void main(String[] args) 
	{
        int n,f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        n = in.nextInt();
        int a[] = new int[n] ;
        for (int j =0;j<n;j++){
            System.out.println("Enter the element of array");
            f = in.nextInt();
            a[j]=f;
        }
		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number

		for (int i = 1; i < n; i++)  // iterate for loop from arrays 1st index (second element)
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