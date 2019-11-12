import java.util.Scanner;

class fibonacci_tribonacci {
	static int n;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		char e;

		do {
			
			System.out.println("Enter your choice: \n1-fibonacci series(0,1...) \n2-tribonacci series(0,0,1....) \nAny other to exit");
			
			int choice = in.nextInt();
			System.out.println("Enter no of terms");
			n = in.nextInt();
			switch(choice) {
				case 1: fibo();
						System.out.println();
						break;
					
				case 2: tribo();
						System.out.println();
						break;
					
				default:System.exit(0);
			}
				
			System.out.println("Do you want to continue?[y/n]: ");
			e = in.next().charAt(0);
		
		} while(e=='y');
	}
	
	public static void fibo() {
		int a = 0, b = 1, c;
		System.out.print(a + "\t" + b + "\t");
		for(int i = 1 ; i <= n ; i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c + "\t");	
		}
	}
	
	public static void tribo() {
		int a = 0, b = 0, c = 1, d;
		System.out.print(a + "\t" + b + "\t" + c + "\t");
		for(int i = 1 ; i <= n ; i++) {
			d = a+b+c;
			a = b;
			b = c;
			c = d;
			System.out.print(d+"\t");
		}
	}
}