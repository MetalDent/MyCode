import java.util.Scanner; 

class factorial_table {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();

		int fact = 1; 

		for(int i = num ; i > 0 ; i--) {
			fact *= i;
		}

		System.out.println("Factorial of " + num +" is " + fact);

		System.out.println("Table of " + num);

		for(int i = 1 ; i <=10 ; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
}