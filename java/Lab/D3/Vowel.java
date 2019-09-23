import java .util.Scanner;
class Vowel
{
public static void main(String args[])
{
	char c;
	Scanner obj = new Scanner(System.in);
	c=obj.next().charAt(0);
	switch(c)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'O':
		case 'U':
		case 'I':System.out.println("Ths is a vowel");
		break;
		default:System.out.println("Ths is not a vowel");
		break;
	}
}
}
