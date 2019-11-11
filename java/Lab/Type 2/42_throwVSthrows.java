//q 42

import java.util.Scanner;

public class throwVSthrows {

	public void calc(int firstOperand, int secondOperand, char operator) throws ArithmeticException{

		switch(operator) {

			case '+': 
				System.out.println("Adding numbers = " + (firstOperand + secondOperand));
				break;
			case '-': 
				System.out.println("Subtracting numbers = " + (firstOperand - secondOperand));
				break;
			case '*': 
				System.out.println("Multiplying numbers = " + (firstOperand * secondOperand));
				break;
			case '/': 
				System.out.println("Dividing numbers = " + (firstOperand / secondOperand));
				break;
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
    	
    	System.out.print("Enter first operand: ");
      	int firstOperand = s.nextInt();
      	
      	System.out.print("Enter second operand: ");
      	int secondOperand = s.nextInt();
      	
      	System.out.print("Enter operator: ");
      	char operator = s.next().charAt(0);

		throwVSthrows obj = new throwVSthrows();
		
		if(secondOperand == 0 && operator == '/') {
			throw new ArithmeticException("Can't divide by zero");
		}


		obj.calc(firstOperand, secondOperand, operator);

		try{

			obj.calc(1587, 0, '/');
		}
		catch(ArithmeticException e){
	   		
	   		System.out.println("Can't divide by 0");
		}
	}
}