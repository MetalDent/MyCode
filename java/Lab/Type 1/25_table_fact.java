import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class table_fact {

	public static BigInteger factorial(int n) {
		
		BigInteger fact = BigInteger.ONE;

        for (int i = 2 ; i <= n ; i++) 
            fact = fact.multiply(new BigInteger(String.valueOf(i)));

        return fact;

    }

	public static void table(int n) {
		
		System.out.println("Table of " + n);
		for(int i = 1 ; i <= 10 ; i++) {

			System.out.println(n + " * " + i + " = " + (n*i));
			System.out.println("Factorial of " + (n*i) + " : " + factorial(n*i));

		}
			
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		table(num);
	}
}