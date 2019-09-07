import java.util.Scanner; 

class prime_factorial {
	
	boolean Prime(int n) 
    {  
        if (n <= 1) 
            return false; 
       
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 

	public static void main(String[] args) {
		
		prime_factorial ob = new prime_factorial();

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int fact = 1, flag = 0;

		for(int i = num ; i > 0 ; i--) {

			if(ob.Prime(i))
				fact *= i;
		}

		System.out.println("Prime Factorial of " + num +" is " + fact);

	}
}