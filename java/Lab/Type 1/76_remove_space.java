import java.util.Scanner;

class remove_space
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the string");
		String str=in.nextLine();
		str=str.replaceAll("\\s ","");
		str=str.trim();
		System.out.println("string after removal of spaces\n"+str);

	}
}