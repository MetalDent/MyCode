import java.io.*;

public class q23 {
   public static void main(String args[])throws IOException{
      int number;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        number=Integer.parseInt(br.readLine());
        
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}