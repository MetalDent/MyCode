import java.util.Scanner; 

class count_vowels_upper_lower {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cV = 0, cU = 0, cL = 0;

        String str = in.nextLine();

        for(int i = 0 ; i < str.length() ; i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || 
                str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                cV++;
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                cU++;
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                cL++;
        }

        System.out.println("Vowels: " + cV);
        System.out.println("Upper-case letters: " + cU);
        System.out.println("Lower-case latters: " + cL);
    }
}