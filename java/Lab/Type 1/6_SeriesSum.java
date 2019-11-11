import java.util.Scanner;
class SeriesSum
{
	static int n;
	public static void main(String args[])
	{
		System.out.println("Enter your choice:\na. 12 + 22 +32 +42 +52 +62 +72 +.... +n\nb. 1-2+3-4+5-6+.... n\nc. 1! + 2! + 3! + 4! +.... n\nd. 2/9-5/13+8/17+....\n any other character to exit");
		Scanner obj= new Scanner(System.in);
		char choice = obj.next().charAt(0);
		System.out.print("enter the no of terms = n =");
		n= obj.nextInt();
		
		System.out.println("the sum of series "+choice);
		switch(choice)
		{
			case 'a': System.out.println("12 + 22 +32 +42 +52 +62 +72 +.... +n "+" is "+ a());
			break;
			case 'b':System.out.println("1-2+3-4+5-6+.... +n " +" is "+b());
			break;
			case 'c':System.out.println("1! + 2! + 3! + 4! +.... n "+" is "+c());
			break;
			case 'd':System.out.println("2/9-5/13+8/17+....+n "+" is "+d());
			break;
			default:System.exit(0);
		}
	}
	public static int a(){
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=12+(10*i);
		}
		return sum;
	}
	public static int b(){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=(i%2!=0)?sum+i:sum-i;
		}
		return sum;
	}
	public static long ftl(int num)
{
		if(num<=1)
			return 1;
		else
			return num*ftl(num-1);
}
	public static long c(){
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=ftl(i);
		}
		return sum;
	}
	public static float d(){
		float sum=0, num=2;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				sum+=num/(num+7+i);
			else
				sum-=num/(num+7+i);
			num+=3;
		}
		return sum;
	}
	}
	