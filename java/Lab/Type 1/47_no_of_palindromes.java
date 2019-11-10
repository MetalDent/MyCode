import java.util.Scanner; 

class no_of_palindromes {

     static boolean isPalindrome(String str) { 

        int i = 0, j = str.length() - 1; 
  
        while (i < j) { 
            
            if (str.charAt(i) != str.charAt(j)) 
                return false; 

            i++; 
            j--; 
        } 
  
        return true; 
    } 

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int len = in.nextInt();

        String str[] = new String[len];
        int ctr = 0;

        for(int i = 0 ; i < len ; i++)
            str[i] = in.next();

        for(int i = 0 ; i < len ; i++) {

            if(isPalindrome(str[i]))
                ctr++;
        }

        System.out.println("No of palindrome words: " + ctr);
    }
}