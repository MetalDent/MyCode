import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class collectionobjects {

	public static void main(String a[]){
		
		List<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Hi");
		myList.add("World");
		myList.add("Yo");
		myList.add("Meow");
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}