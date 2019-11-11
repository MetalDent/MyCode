
// Java program to print anagrams  
// together using dictionary  
import java.util.*;  
  
public class q40 {  
  
    private static void printAnagrams(String arr[])  
    {  
        HashMap<String, List<String> > map = new HashMap<>();  
  
        // loop over all words  
        for (int i = 0; i < arr.length; i++) {  
  
            String word = arr[i];  
            char[] letters = word.toCharArray();  
            Arrays.sort(letters);  
            String newWord = new String(letters);  
  
            if (map.containsKey(newWord)) {  
  
                map.get(newWord).add(word);  
            }  
            else {  
  
                List<String> words = new ArrayList<>();  
                words.add(word);  
                map.put(newWord, words);  
            }  
        }  
  
        for (String s : map.keySet()) {  
            List<String> values = map.get(s);  
            if (values.size() > 1) {  
                System.out.print(values);  
            }  
        }  
    }  
  
    public static void main(String[] args)  
    {  
  
        // Driver program  
        String arr[] = { "cat", "dog", "tac", "god", "act" };  
        printAnagrams(arr);  
    }  
}