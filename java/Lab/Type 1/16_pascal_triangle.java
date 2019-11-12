import java.util.Scanner;

class pascal_triangle {
	public static void main(String[] args) {
        int space, i, j, value = 1;
		
        System.out.println("Enter row no.");
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();

       for(i=0; i<n; i++) {
            for(space=1; space <= n-i; space++) 
                System.out.print(" ");
 
            for(j=0; j <= i; j++) {
                if (j==0 || i==0)    
                    value = 1;
                else
                    value = value*(i-j+1)/j;  
     
                System.out.print(value+" ");
            }

            System.out.println();
        }
    }
}