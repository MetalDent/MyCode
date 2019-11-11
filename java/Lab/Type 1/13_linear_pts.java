import java.util.Scanner;
class linear
{
	public static void main(String[] args) {
		float x[]=new float[3];
		float y[]=new float[3];
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the coordinates of the 3 points (x,y)");
		for(int i=0;i<3;i++)
		{
			x[i]=obj.nextFloat();
			y[i]=obj.nextFloat();
		}
		float m1= (x[0]-x[1])/(y[0]-y[1]);
		float m2= (x[1]-x[2])/(y[1]-y[2]);
		if(m1==m2)		
		System.out.println("all the 3 points are linear points");
		else
		System.out.println("all the 3 points are not linear points");
	}

}