import java.util.Scanner;
class q77html
{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the html code");
		String str=obj.nextLine();
		str=str.replaceAll("\\<.*?\\>","");
		System.out.println("string after removal of html tags\n"+str);

	}
}