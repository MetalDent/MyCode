import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class factorial1_1000 {

	public static BigInteger factorial(int n) {
		
		BigInteger fact = BigInteger.ONE;

        for (int i = 2 ; i <= n ; i++) 
            fact = fact.multiply(new BigInteger(String.valueOf(i)));

        return fact;

    }

	public static void table(int n) {
		
		System.out.println("Table of " + n);
		for(int i = 1 ; i <= 10 ; i++)
		System.out.print(n + " * " + i + " = " + (n*i) + "\n");
			
	}

	public static void main(String args[]) {
		for(int i = 1 ; i <= 1000 ; i++)
		{
			System.out.println("Factorial of " + i + " = " + factorial(i));
			table(i);
		}
	}
}
