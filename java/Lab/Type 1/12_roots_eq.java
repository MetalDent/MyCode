import java.util.Scanner;
import java.lang.Math;
class roots
{
	public static void main(String[] args) {
		float a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the a,b,c coefficients of a quadratic equation");
		a=obj.nextFloat();
		b=obj.nextFloat();
		c=obj.nextFloat();
		float d = (float) Math.sqrt((b*b - 4*a*c));
		float x1,x2;
		x1=(-b+d)/(2*a);
		x2=(-b-d)/(2*a);
		System.out.println("roots of quadratic equation are "+x1+"\t"+x2);
	}

}