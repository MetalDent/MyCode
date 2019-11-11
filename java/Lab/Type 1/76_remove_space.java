import java.util.Scanner;
class q76space
{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the string");
		String str=obj.nextLine();
		str=str.replaceAll("\\s ","");
		str=str.trim();
		System.out.println("string after removal of spaces\n"+str);

	}
}