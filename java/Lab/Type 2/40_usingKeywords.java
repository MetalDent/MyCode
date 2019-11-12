import java.util.Scanner;

class keywords_usage {

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
		Scanner in = new Scanner(System.in);
		double radius = in.nextInt();
		usingKeywords ud_circle = new usingKeywords(radius);
		System.out.println("User defined circle area = " + ud_circle.area());
	}
}