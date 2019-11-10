import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
		System.out.println("enter the number ");
	Scanner obj = new Scanner(System.in);
	int num= obj.nextInt();
	
	System.out.println("the factorial of "+num+"= "+ftl(num));
	
	table(num);
}
public static int ftl(int n)
{
		if(n<=1)
			return 1;
		else
			return n*ftl(n-1);
}
public static void table(int n)
{
	System.out.println("the table of "+ n);
	for(int i =1;i<=10;i++)
	System.out.println( n+" * "+i+" = "+( n*i));
		
}
	
}