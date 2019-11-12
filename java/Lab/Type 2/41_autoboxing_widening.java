import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class autoboxing_widening {

    public boolean isPrime(Integer n) {

    	if(n == 1)	return false;
    	for (Integer i = 2; i * i < n; i++) {
    		
    		if(n % i == 0)	return false;
    	}
    	return true;
    }

    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	autoboxing_widening Object = new autoboxing_widening();
    	System.out.println(Object.isPrime(n));
    }
}