import java.util.Scanner;
public class overloading_overriding {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		double height = s.nextDouble();
		
		area object = new area();
		object.figure(radius);
		volume obj = new volume();
		obj.figure(radius);
		obj.figure(radius, height);
	}
}

class area {

	public void figure(double radius) {

		System.out.println("area of circle is " + (3.14 * radius * radius));
	}
}

class volume extends area {

	public void figure(double radius) {

		System.out.println("volume of sphere = " + (0.75 * 3.14 * radius * radius));
	}
	public void figure(double radius, double height) {

		System.out.println("volume of cone = " + (3.14 * radius * radius * height));
	}
}