import java.util.Scanner;

class linear_pts {
	
	public static void main(String[] args) {
		
		float x[] = new float[3];
		float y[] = new float[3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the coordinates of the 3 points (x,y): ");
		for(int i = 0 ; i < 3 ; i++) {
			x[i] = in.nextFloat();
			y[i] = in.nextFloat();
		}

		float d1 = (x[0]-x[1])/(y[0]-y[1]);
		float d2 = (x[1]-x[2])/(y[1]-y[2]);
		
		if(d1==d2)		
			System.out.println("Points are linear points");
		else
			System.out.println("Points are not linear points");
	}

}