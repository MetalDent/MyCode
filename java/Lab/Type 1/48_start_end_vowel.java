import java.util.Scanner; 

class start_end_vowel {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int len = in.nextInt();

        String str[] = new String[len];
        int ctr = 0;

        for(int i = 0 ; i < len ; i++)
            str[i] = in.next();

        for(int i = 0 ; i < len ; i++) {

            int l = str[i].length();
            if((str[i].charAt(0) == 'a' || str[i].charAt(0) == 'e' || str[i].charAt(0) == 'i' || str[i].charAt(0) == 'o' || str[i].charAt(0) == 'u') &&
                (str[i].charAt(l-1) == 'a' || str[i].charAt(l-1) == 'e' || str[i].charAt(l-1) == 'i' || str[i].charAt(l-1) == 'o' || str[i].charAt(l-1) == 'u'))
                ctr++;
        }

        System.out.println("No of words starting and ending with vowels: " + ctr);
    }
}