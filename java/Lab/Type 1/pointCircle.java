import java .util.Scanner;
class pointCircle
{
public static void main(String args[])
{
	float x,y,a,b,r;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the center of the circle");
	a=obj.nextFloat();
	b=obj.nextFloat();
	System.out.println("enter the radius of the circle");
	r=obj.nextFloat();
	System.out.println("enter the point to be tested");
	x=obj.nextFloat();
	y=obj.nextFloat();

	if( Math.pow((x - a),2) + Math.pow((y - b),2) < Math.pow(r,2))
	System.out.println("This point is inside the circle ");
else
	System.out.println("this point is not inside the circle");
	
}
}
