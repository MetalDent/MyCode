import java.util.Scanner;

class html_tag
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the html code");
		String str=in.nextLine();
		str=str.replaceAll("\\<.*?\\>","");
		System.out.println("string after removal of html tags\n"+str);

	}
}