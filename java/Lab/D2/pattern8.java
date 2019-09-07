import java.util.Scanner; 

class pattern8 {
	
	static int[] check_prime(int n) 
    {  
        int len = (n*(n+1))/2;
        int[] primes = new int[50];

        int i = 1, p = 2, flag;

        while(i <= len)
	    {
	        flag = 1;
	        for(int j = 2 ; j <= p-1 ; j++)
	        {
	            if( p%j == 0)  
	            {
	            	flag = 0;
	             	break;      
	            }  
	        }
	            if(flag == 1)
	            {
	                primes[i] = p;
	             	i++;
	            }

	        p++;
	    }

	    return primes;
    }

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int t = 1;

		int[] p = new int[50];

		p = check_prime(num);

		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j > i ; j--) {
				System.out.print(" ");
			}

			for(int k = 1 ; k <= i ; k++) {
				System.out.print(p[t]);
				t++;
			}

			System.out.println();
		}
	}
}