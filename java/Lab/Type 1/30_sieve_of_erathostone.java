import java.util.Scanner;

class soe
{ 
	void soe(int n) 
	{  
		boolean prime[] = new boolean[n+1]; 
		for(int i=0;i<=n;i++) 
			prime[i] = true; 
		
		for(int p = 2; p*p <=n; p++) 
		{ 
			
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 
		
		
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) 
				System.out.print(i + " "); 
		} 
	} 
	 
	public static void main(String args[])
	{ 
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=in.nextInt();
		System.out.print("Following are the prime numbers "); 
		System.out.println("smaller than or equal to " + n); 
		soe obj = new soe(); 
		obj.soe(n); 
	} 
} 

