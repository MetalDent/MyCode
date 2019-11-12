import java.util.Scanner;

class decimalToBinary {
    
    public static void main(String args[]) {
        
        int dNum, quot, i=1, j;
        int bNum[] = new int[100];
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dNum = in.nextInt();
		
        quot = dNum;
		
        while(quot != 0)
        {
            bNum[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bNum[j]);
        }
        System.out.print("\n");
    }
}