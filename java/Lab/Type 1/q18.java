import java.io.*;
class q18
{
	public static void main(String[] args)throws IOException 
    {
        int circlex,circley,x,y,rad;
		System.out.println("enter circle centre -> x and y co-ordinates ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		circlex=Integer.parseInt(br.readLine());
		circley=Integer.parseInt(br.readLine());
		System.out.println("enter circle radius ");
		rad=Integer.parseInt(br.readLine());
		System.out.println("enter the point x and y you want to check ");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		isIn(circlex,circley,x,y,rad);
    }
	public static void isIn(int circlex,int circley,int x,int y,int r)
	{
		if(((circlex-x)*(circlex-x))+((circley-y)*(circley-y))< (r*r))
	       System.out.println("Point lies in the circle");
	   else
	   	 System.out.println("Point lies outside the circle");
	}	
}