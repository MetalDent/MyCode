import java.util.Scanner;
class oddDivisors
{
	static int nod,ned;
	public static void main(String[] args) {
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		n=obj.nextInt();
		nod=ned=0;
		for(int i=1;i< n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
					ned++;
				else
					nod++;
			}
		}
		System.out.println("no.of odd divisors "+nod+"\nno.of even divisors "+ned);
	}

}