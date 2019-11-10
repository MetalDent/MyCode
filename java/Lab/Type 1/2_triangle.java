import java.util.Scanner; 
import java.lang.Math;

class triangle {
	
	static boolean check(double x, double y, double z) {	//check whether valid triangle or not

		if(((x+y) > z) && ((y+z) > x) && ((z+x) > y))
			return true;

		return false;
	}

	static boolean check_equilateral(double x, double y, double z) { 

		if(check(x, y, z)) {
			if((x == y) && (y == z))
				return true;

			return false;
		}

		System.out.println("Invalid triangle!");
		System.exit(0);
		return false;
		
	}

	static boolean check_isosceles(double x, double y, double z) {

		if(check(x, y, z)) {
			if(((x == y) && (y != z)) || ((y == z) && (z != x)) || ((z == x) && (x != y)))
				return true;

			return false;
		}

		System.out.println("Invalid triangle!");
		System.exit(0);
		return false;
		
	}

	static boolean check_scalene(double x, double y, double z) {

		if(check(x, y, z)) {
			if((x != y) && (y != z) && (z != x))
				return true;

			return false;
		}

		System.out.println("Invalid triangle!");
		System.exit(0);
		return false;
	}

	static boolean check_right(double x, double y, double z) {

		double a = Math.pow(x, 2), b = Math.pow(y, 2), c=Math.pow(z, 2);
		if(check(x, y, z)){
			if((a+b == c) || (b+c == a) || (c+a == b))
				return true;

			return false;
		}

		System.out.println("Invalid triangle!");
		System.exit(0);
		return false;
}

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		System.out.println("Enter sides: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();

		int choice;

		System.out.println("Choices: ");
		System.out.println("1. Validate Triangle \n2. Equilateral \n3. Isosceles \n4. Scalene \n5. Right angled");
		System.out.println("Enter your choice: ");
		choice = in.nextInt();

		switch(choice) {
			case 1 : if(check(x, y, z))
						System.out.println("Valid triangle!");
					else
						System.out.println("Invalid triangle!");
					break;

			case 2 : if(check_equilateral(x, y, z))
						System.out.println("Equilateral triangle!");
					else
						System.out.println("Not an Equilateral triangle!");
					break;

			case 3 : if(check_isosceles(x, y, z))
						System.out.println("Isosceles triangle!");
					else
						System.out.println("Not an Isosceles triangle!");
					break;

			case 4 : if(check_scalene(x, y, z))
						System.out.println("Scalene triangle!");
					else
						System.out.println("Not a Scalene triangle!");
					break;

			case 5 : if(check_right(x, y, z))
						System.out.println("Right angled triangle!");
					else
						System.out.println("Not a Right angled triangle!");
					break;

			default : System.out.println("Wrong choice!");
		}
	}
}