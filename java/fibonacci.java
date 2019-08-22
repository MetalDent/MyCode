import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		
		int f = 0, s = 1, next;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no of terms: ");
		
		int n = input.nextInt();

		System.out.println("Fibonacci numbers: ");
		
		for(int i = 0 ; i < n ; i++) {
			
			if(i == 0)
				System.out.printf("%d \n", f);
			else if(i == 1)
				System.out.printf("%d \n", s);
			else {
				
				next = f + s;
				
				System.out.printf("%d \n", next);
				
				f = s;
				s = next;
			}
		}
			
			
	}
}
