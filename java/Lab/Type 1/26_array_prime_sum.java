import java.util.Scanner;

class array_prime_sum{
public static void main (String[] args){
    int[] array = new int [5];
    int sum=0;
    Scanner in = new Scanner (System.in);

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<5; i++)
    {
        array[i] = in.nextInt();
    }

    for(int i=0; i<array.length; i++){

    	if(isPrimeNumber(array[i]))
    	{
    		sum=sum+array[i];
    	}
     }
     System.out.println(sum);
 }

     
       
    private  static boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    
}
}
