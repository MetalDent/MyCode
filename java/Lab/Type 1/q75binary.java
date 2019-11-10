import java.util.Scanner;
class q75binary
{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the number");
		int num= obj.nextInt();
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