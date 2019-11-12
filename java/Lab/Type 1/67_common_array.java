import java.util.Scanner;

class common_array
{
	public static void main(String[] args) {
		int m,n;
		Scanner in= new Scanner(System.in);
		System.out.println("enter the sizes of array");
		m=in.nextInt();
		n=in.nextInt();	

		int[] ar1=new int[m];
		int[] ar2= new int[n];
		System.out.println("enter the elemnets of array1");
		for(int i=0;i<m;i++)
		{
			ar1[i]=in.nextInt();
		}
		System.out.println("enter the elemnets of array2");
		for(int i=0;i<n;i++)
		{
			ar2[i]=in.nextInt();
		}
		System.out.println("common elemnts are ");


		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(ar1[j]==ar2[i])
					System.out.println(ar1[j]);
			}
		}



	}
} 