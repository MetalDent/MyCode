import java.util.Scanner; 

class check_prime {
	
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

		int flag = 0;

		if(Prime(ob.num))
			System.out.println("Prime!");

		else
			System.out.println("Not Prime!");

	}
}