import java.util.Scanner; 

class check_armstrong {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		int remainder, result = 0, n = 0;

        for (int i = num ; i != 0 ; i /= 10)
        	n++;
       
        for (int i = num ; i != 0; i /= 10) {
            remainder = i % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println("Armstrong number!");
        
        else
            System.out.println("Not an Armstrong number!");
	}
}