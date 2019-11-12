import java.util.Scanner;
import java.lang.Math;

class roots_eq {
	
	public static void main(String[] args) {
		
		float a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the a, b, c coefficients of a quadratic equation");
		a = in.nextFloat();
		b = in.nextFloat();
		c = in.nextFloat();
		
		float d = (float) Math.sqrt((b*b - 4*a*c));
		
		float x1,x2;
		x1 = (-b+d)/(2*a);
		x2 = (-b-d)/(2*a);
		
		System.out.println("Roots of quadratic equation are " + x1 + " and " + x2);
	}

}