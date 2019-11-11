//q47

import java.util.Scanner;
public class assertTest{
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		assert n != 1 : "Neither prime nor composite";
		for (int i = 2; i * i < n; i++) {
			
			if(n % i == 0)	System.out.println("NOT PRIME");
		}
		System.out.println("PRIME");
	}
}
