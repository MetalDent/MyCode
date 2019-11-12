import java.util.Scanner;

class prime_factors {
   public static void main(String args[]) {
      int n;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        n=in.nextInt();
        
      for(int i = 2; i< n; i++) {
         while(n%i == 0) {
            System.out.println(i+" ");
            n = n/i;
         }
      }
      if(n >2) {
         System.out.println(n);
      }
   }
}