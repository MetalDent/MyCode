import java.util.Scanner; 

class find_large_small {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();

		int large = x;
		int small = x;

		if(x < y) {
			if(y < z)
				large = z;
			else
				large = y;

			if(x < z)
				small = x;
			else
				small = z;
		} 
		else {
			if(y > z)
				small = z;
			else
				small = y;
			
			if(x > z)
				large = x;
			else
				large = z;
		}

		System.out.println("Largest = " + large + " Smallest = " + small);
	}
}