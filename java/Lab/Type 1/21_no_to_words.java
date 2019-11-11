import java.util.Scanner;
class words
{
	public static void main(String[] args) {
		int num;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the number");
		/*num=obj.nextInt();
		int r=0;
		while(num!=0)
		{
			r=num%10;
			convert(r);
			num/=10;

		}*/
		convert(obj.next().charAt(0).atoi());
	}
	static void  convert(int x)
	{
		String wrd="";
		switch(x)
		{
			case 1:
			wrd="one";
			break;
			case 3:
			wrd="three";
			break;
			case 5:
			wrd="five";
			break;
			case 7:
			wrd="seven";
			break;
			case 8:
			wrd="eight";
			break;
			case 4:
			wrd="four";
			break;
			case 6:
			wrd="six";
			break;
			case 9:
			wrd="nine";
			break;
			case 2:
			wrd="two";
			break;
			case 0:
			wrd="zero";
			break;
			default:
			System.out.println("not a valid num");

		}
		System.out.print(wrd+" ");
	}
	
}