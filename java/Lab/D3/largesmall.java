import java.util.Scanner;
class largesmall
{
public static void main(String args[])
{
	int num1,num2,num3;
	Scanner obj= new Scanner(System.in);
	num1=obj.nextInt();
	num2=obj.nextInt();
	num3=obj.nextInt();
	int largest,smallest;
	if(num1<num2)
	{
		if(num2<num3)
			largest=num3;
		else
			largest=num2;
		if(num1<num3)
			smallest=num1;
		else
			smallest=num3;
	}
	else
	{
		if(num2>num3)
			smallest=num3;
		else
			smallest=num2;
		
		if(num1>num3)
			largest=num1;
		else
			largest=num3;
	}
	System.out.println("Largest and smallest numbers are:"+largest+"\n"+smallest);
}
}