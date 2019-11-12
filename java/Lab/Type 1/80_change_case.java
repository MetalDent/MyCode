import java.util.Scanner;
import java.lang.*;

class change_case
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=in.nextLine();
		int l=s.length();
		char c[]=new char [l];
		c=s.toCharArray();

		for(int i=0;i<l;i++)
		{
			if(c[i]<='z' && c[i]>='a')
				c[i]=(char)(c[i]-32);
			else if(c[i]<='Z' && c[i]>='A')
				c[i]=(char)(c[i]+32);
		}
		String str=new String(c);
		System.out.println(str);


	}
}