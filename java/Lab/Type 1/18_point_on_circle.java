import java.util.Scanner;

class point_on_circle {
	public static void main(String[] args) {
        int circle_x,circle_y,x,y,rad;
		System.out.println("Enter circle centre (x and y co-ordinates) ");
		Scanner in = new Scanner(System.in);
		circle_x = in.nextInt();
		circle_y = in.nextInt();
		System.out.println("Enter circle radius ");
		rad = in.nextInt();
		System.out.println("Enter the point x and y you want to check ");
		x = in.nextInt();
		y = in.nextInt();
		isIn(circle_x, circle_y, x, y, rad);
    }

	public static void isIn(int circle_x, int circle_y, int x, int y, int r) {
		if(((circle_x-x)*(circle_x-x)) + ((circle_y-y)*(circle_y-y)) < (r*r))
	       	System.out.println("Point lies in the circle");
	   	else
	   	 	System.out.println("Point lies outside the circle");
	}	
}