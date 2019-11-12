import java.util.Scanner;

class LCM_GCD {
	
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int gcd = 0, lcm, i;
    char e;
    
    do {
		  System.out.println("Enter your choice \n 1.LCM \n 2.HCF");
		  int ch = in.nextInt();
		  
      System.out.println("Enter two numbers");
		  int x = in.nextInt();
		  int y = in.nextInt();

		  switch(ch) {

        case 1: int  minMultiple = (x > y) ? x : y;
                while(true) {
                  if( minMultiple%x == 0 && minMultiple%y == 0 ) {
                    System.out.println("The LCM of of " + x +" and " + y + " is " + minMultiple);
                    break;
                  }
                  
                  ++minMultiple;
                }
               break;
			 
        case 2: for(i = 1 ; i <= x && i <= y ; i++) {
                  if(x%i == 0 && y%i == 0)
                  gcd = i;
                }
              
              System.out.println("G.C.D of "+ x + " and " + y + " is " + gcd);
              break;
			
        default:System.out.println("wrong choice");
		}

		System.out.println("Do you continue?(y/n)");
    e = in.next().charAt(0);
	 } while(e == 'y');
	}
}