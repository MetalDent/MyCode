import java.util.Scanner;
import java.lang.Math; 

class Triangle
{	static double side1,side2,side3;

public static void main(String args[])
{
	int choice;
	Scanner obj= new Scanner(System.in);
	System.out.println("Press \n1 for checking if valid triangle\n2 for checking if equilateral triangle\n3 for checking if isosceles triangle\n4 for checking scalene triangle\n5 for right angled triangle\nany other number to exit");
	choice=obj.nextInt();
	
	
	switch(choice)
	{
		case 1: enterData();
		if(validTriangle())
					System.out.println("the triangle is a valid triangle");	
else
			System.out.println("the triangle is not a valid triangle");	

		break;
		case 2: enterData();
		equilateralTriangle();
		break;
		case 4:  enterData();
		scaleneTriangle();
		break;
		case 5: enterData();
		rightTriangle();
		break;
		case 3: enterData();
		isoscelesTriangle();
		break;
		default: 	System.exit(0);
	}	
		
}
public static void enterData()
{
		Scanner obj= new Scanner(System.in);

	System.out.println("enter the triangle sides\n");
	side1=obj.nextDouble();
	side2=obj.nextDouble();
	side3=obj.nextDouble();
}
public static boolean validTriangle(){
	if((side1+side2 >side3) && (side2+side3>side1) && (side1+side3>side2))
			
		return true;
		else
					return false;
//				System.out.println("the triangle is not a valid triangle");	

}
public static void equilateralTriangle(){
	if(validTriangle()){
	if(side1==side2 && side2==side3 &&side1==side3)
					System.out.println("the triangle is an equilateral triangle");	
				else
								System.out.println("the triangle is not an equilateral triangle");	
	}
	else
			System.out.println("the triangle is not a valid triangle");	

}
public static void scaleneTriangle(){
		if(validTriangle())
		{
			if(side1!=side2 && side2!=side3 &&side1!=side3)
									System.out.println("the triangle is a scalene triangle");	
								else 					System.out.println("the triangle is not a scalene triangle");
		}
else
					System.out.println("the triangle is not valid");	
	



}

public static void rightTriangle(){
	double a=Math.pow(side1,2), b=Math.pow(side2,2),c=Math.pow(side3,2);
	if(validTriangle()){
	if((a+b==c)||(b+c==a)||(c+a==b))
										System.out.println("the triangle is a right angled triangle");
else
								System.out.println("the triangle is not a right angled triangle");	
	}else
			System.out.println("the triangle is not a valid triangle");	
}

public static void isoscelesTriangle(){
	if(validTriangle()){
	if((side1==side2 && side1!=side3) || (side2==side3 && side1!=side2)||(side1==side3 && side2!=side1))
					System.out.println("the triangle is an isosceles triangle");
else
			System.out.println("the triangle is not an isosceles triangle");	
	}
	else
			System.out.println("the triangle is not a valid triangle");	

}

}