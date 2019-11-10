import java.util.Scanner; 

class sort_lexicographical {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        String words[] = new String[len];

        for(int i = 0 ; i < len ; i++)
            words[i] = in.next();

        for(int i = 0 ; i < len-1 ; ++i) {
            for (int j = i + 1 ; j < len ; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for(int i = 0 ; i < len ; i++)
            System.out.println(words[i]);
    }
}