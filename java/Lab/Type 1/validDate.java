import java.util.Scanner;
class validDate
{
	public static void main(String[] args) {
		int date,month;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the date and month");
		date=obj.nextInt();
		month=obj.nextInt();

		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			if(date>0 && date<=31)
				System.out.println(" is a valid date");
			else
				System.out.println(" is not a valid date");
			break;
			case 4:
			case 6:
			case 9:
			case 11:if(date>0 && date<=30)
				System.out.println(" is a valid date");
			else
				System.out.println(" is not a valid date");
			break;
			case 2:if(date>0 && date<=28)
				System.out.println(" is a valid date");
			else
				System.out.println(" is not a valid date");
			break;
			default:
			System.out.println("not a vlid date");

		}
	}
	
}