 import java.util.ArrayList;
import java.util.Collections;
 
class shuffle {
 
    public static void main(String a[]){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hello");
        arr.add("Hi");
        arr.add("World");
        arr.add("Yo");
        arr.add("Meow");
         
        Collections.shuffle(arr);
        System.out.println("Results after shuffle operation:");
        for(String str: arr){
            System.out.println(str);
        }
         
        Collections.shuffle(arr);
        System.out.println("Results after shuffle operation:");
        for(String str: arr){
            System.out.println(str);
        }
    }
}