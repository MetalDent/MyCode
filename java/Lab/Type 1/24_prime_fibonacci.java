import java.util.*; 
import java.io.*;

class prime_fibonacci {

	static ArrayList<Integer> num = new ArrayList<Integer>(); 

	public static void fibo(int n) {
		int a = 0, b = 1, c;
		num.add(a);
		num.add(b);
		for(int i = 2 ; i < n ; i++) {
			c = a+b;
			a = b;
			b = c;
			num.add(c);	
		}

		System.out.println("nth element: " + num.get(n-1));
	}

	static boolean prime(int n) 
    {  
        if (n <= 1) 
            return false; 
       
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 


	public static void main(String s[]) { 
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); 

		fibo(n); 

		System.out.println("Prime nos in series: ");
		for(int i = 0 ; i < n ; i++) {

			int t = (int) num.get(i);
			boolean a = prime(t);

			if(a)
				System.out.println(num.get(i));
		}
	} 
} 

