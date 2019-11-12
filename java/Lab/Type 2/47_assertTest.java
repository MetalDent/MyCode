import java.util.Scanner;
class assert_usage{
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		assert n != 1 : "Neither prime nor composite";
		for (int i = 2; i * i < n; i++) {
			
			if(n % i == 0)	System.out.println("NOT PRIME");
		}
		System.out.println("PRIME");
	}
}
