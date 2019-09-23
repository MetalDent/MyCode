class swap
{
public static void main(String args[])
{
	int a=0,b=9;
	
	System.out.println(a+" "+b);
	//using 3rd variable
	int c = a;
	a=b;
	b=c;
	
	System.out.println(a+" "+b);
	
	//without using 3rd variable
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a+" "+b);
}
}