import java.util.Scanner; 

class table_of_n {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt(); 

		System.out.println("Table of " + num);

		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i * num);
		}
	}
}