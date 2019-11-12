import java.util.ArrayList;
import java.util.Iterator;
 
class read_arraylist {
 
    public static void main(String a[]){
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("First");
        arr.add("Second");
        arr.add("Third");
        arr.add("Random");
        Iterator<String> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}