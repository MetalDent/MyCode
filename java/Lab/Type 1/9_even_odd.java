import java.util.Scanner;

class even_odd {
	public static void main(String args[]) {
		
		Scanner in= new Scanner(System.in);
		char e;

		do{
			System.out.println("Enter\n1-Even digits\n2-Odd digits\nAny other to exit");
			int choice = in.nextInt();
			System.out.println("Enter no: ");
			int n = in.nextInt();
			int r = 0, nO = 0, nE = 0;
			while(n != 0) {
				r = n%10;
				if(r%2 == 0)
					nE++;
				else nO++;
				n /= 10;
			}			

			switch(choice) {
				case 1: System.out.println("Even digits: " + nE);
						break;
				
				case 2: System.out.println("Odd digits: " + nO);
						break;
				
				default: System.exit(0);
			}

			System.out.println("Do you want to continue?[y/n]: ");
			e = in.next().charAt(0);
			
		} while(e =='y');
	}
}