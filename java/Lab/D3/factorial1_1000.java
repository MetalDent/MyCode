class factorial1_1000
{

public static long ftl(int n)
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
	System.out.print( n+" * "+i+" = "+( n*i)+"\t");
		
}
	public static void main(String args[])
	{
		for(int i= 1;i<=1000;i++)
		{
			System.out.println("the factorial of "+i+"= "+ftl(i));
			table(i);
		}
	}
}