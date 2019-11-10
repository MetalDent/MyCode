import java.util.Scanner;

class string_permutations {  

    public static void generate(String str, int start, int end) {  
        if (start == end-1)  
            System.out.println(str);  

        else {  

            for (int i = start ; i < end ; i++)  
            {  
                str = swap(str, start, i);  

                generate(str, start+1, end);  

                str = swap(str, start,i);  
            }  
        }  
    }  

    public static String swap(String x, int i, int j) {  
        
        char y[] = x.toCharArray();  
        char ch;  
        ch = y[i];  
        y[i] = y[j];  
        y[j] = ch;  
        return String.valueOf(y);  
    } 
      
    public static void main(String[] args) {  
        
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();  

        int len = str.length();  

        System.out.println("All the permutations: ");  
        generate(str, 0, len);  
    }  
}  