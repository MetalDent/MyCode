import java.util.Scanner;

class throw_throws {

	public void calc(int f, int s, char operator) throws ArithmeticException{

		switch(operator) {

			case '+': 
				System.out.println("Adding numbers = " + (f + s));
				break;
			case '-': 
				System.out.println("Subtracting numbers = " + (f - s));
				break;
			case '*': 
				System.out.println("Multiplying numbers = " + (f * s));
				break;
			case '/': 
				System.out.println("Dividing numbers = " + (f / s));
				break;
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
    	
    	System.out.print("Enter first operand: ");
      	int f = in.nextInt();
      	
      	System.out.print("Enter second operand: ");
      	int s = in.nextInt();
      	
      	System.out.print("Enter operator: ");
      	char operator = in.next().charAt(0);

		throw_throws obj = new throw_throws();
		
		if(s == 0 && operator == '/') {
			throw new ArithmeticException("Can't divide by zero");
		}


		obj.calc(f, s, operator);

		try{

			obj.calc(1587, 0, '/');
		}
		catch(ArithmeticException e){
	   		
	   		System.out.println("Can't divide by 0");
		}
	}
}