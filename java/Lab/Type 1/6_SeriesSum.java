import java.util.Scanner;

class SeriesSum {
	static int n;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter your choice: \na. 12 + 22 +32 +42 +52 +62 +72 +.... +n \nb. 1-2+3-4+5-6+.... n \nc. 1! + 2! + 3! + 4! +.... n \nd. 2/9-5/13+8/17+....\nAny other character to exit");
		char ch = in.next().charAt(0);

		System.out.print("Enter no of terms: ");
		n = in.nextInt();
		
		System.out.println("The sum of series: ");
		switch(ch)
		{
			case 'a': System.out.println(a());
				break;

			case 'b':System.out.println(b());
				break;

			case 'c':System.out.println(c());
				break;

			case 'd':System.out.println(d());
				break;

			default:System.exit(0);
		}
	}

	public static int a() {
		
		int sum = 0;
		for(int i = 0 ; i < n ; i++)
		{
			sum += 12 + (10*i);
		}
		return sum;
	}

	public static int b() {
		
		int sum = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			sum = (i%2!=0) ? sum+i : sum-i;
		}
		return sum;
	}

	public static long ftl(int num) {
		
		if(num <= 1)
			return 1;
		else
			return num*ftl(num-1);
	}

	public static long c() {
		
		long sum = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			sum += ftl(i);
		}
		return sum;
	}

	public static float d() {
		
		float sum = 0, num = 2;
		for(int i = 0 ; i < n ; i++)
		{
			if(i%2 == 0)
				sum += num/(num+7+i);
			else
				sum -= num/(num+7+i);
			num += 3;
		}
		return sum;
	}
}
	
