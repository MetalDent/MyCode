//q40
//I hope using final and static together is ok as per question's demands? I really can't find a no-redundant way to use final and static independent of each other.
import java.util.Scanner;

public class usingKeywords {

	final static double PI = 3.14;
	double radius;
	public usingKeywords() {

		this(7.00);
	}
	public usingKeywords(double radius) {

		this.radius = radius;
	}
	public double area() {

		return (PI * (radius * radius));
	}
	public static void main(String[] args) {
		
		usingKeywords circle = new usingKeywords();
		System.out.println("Default circle area = " + circle.area());
		Scanner s = new Scanner(System.in);
		double radius = s.nextInt();
		usingKeywords ud_circle = new usingKeywords(radius);
		System.out.println("User defined circle area = " + ud_circle.area());
	}
}