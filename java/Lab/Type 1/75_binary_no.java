import java.util.Scanner;

class binary_no
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= in.nextInt();
		if(isBinary(num))
			System.out.println(num+" is binary");
		else
			System.out.println(num+" is not binary");
}
	public  static boolean isBinary(int num)
	{
			while(num!=0)
			{
				int r=num%10;
				if(r!=0&&r!=1)
					return false;
				num=num/10;
			}
			return true;

	}
}