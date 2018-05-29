import java.util.Scanner;

public class ser {
	
	public static void main(String[] args) {
		
		int f = 0, s = 1, next;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no of terms: ");
		
		int n = input.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			
			if(i == 0)
				System.out.printf("%d ", f);
			else if(i == 1)
				System.out.printf("%d ", s);
			else {
				
				next = f + s;
				
				System.out.printf("%d ", next);
				
				f = s;
				s = next;
			}
		}
			
			
	}
}
