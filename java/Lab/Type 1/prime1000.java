class prime1000
{
	public static void main(String args[])
	{
		for(int i=1;i<=1000;i++)
			if(prime(i))
			System.out.println(i+" is a prime number\n");
	}

	static boolean prime(int num)
	{
		for (int i=2;i<num ;i++ ) {
			if(num%i==0)
				return false;
		}
		return true;

	}
}