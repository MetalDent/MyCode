import java.util.ArrayList;
import java.util.Iterator;

class iterator {
   public static void main(String[] args) {
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("Hello");
      arr.add("Hi");
      arr.add("World");
      arr.add("Yo");
      arr.add("Meow");
      System.out.println("The ArrayList elements are: ");
      for (String s: arr) {
         System.out.println(s);
      }
      Iterator i = arr.iterator();
      String str = "";
      while (i.hasNext()) {
         str = (String) i.next();
         if (str.equals("Hi")) {
            i.remove();
            System.out.println("\nThe element Hi is removed");
            break;
         }
      }
      System.out.println("\nThe ArrayList elements are: ");
      for (String s: arr) {
         System.out.println(s); 
      }
   }
}
