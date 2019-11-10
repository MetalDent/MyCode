class swap {

	void swap_with(int x, int y)	{	//using 3rd variable

		int temp = x;	
		x = y;
		y = temp;

		System.out.println("Using third variable: ");
		System.out.println("x = " + x + " and y = "+ y + "\n");
	}

	void swap_without(int x, int y) {	//without using 3rd variable

		x = x + y;	
		y = x - y;
		x = x - y;

		System.out.println("Without using third variable: ");
		System.out.println("x = " + x + " and y = "+ y + "\n");

	}

	public static void main(String args[]) {
		int x = 3, y = 27;
		
		swap ob = new swap();

		ob.swap_with(x, y);
		
		ob.swap_without(x, y);
	}
}