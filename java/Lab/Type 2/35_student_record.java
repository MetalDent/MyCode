//q 35
import java.util.*;

public class q35 {

	public static void main(String[] args) {
		
		Record obj = new Record();
		obj.readvalues();
		obj.display();
		Rank object = new Rank();
		object.highest();
		object.display();
	}
}
class Record {

	int n = 5;
	String name[] = new String[n];
	int rnk[] = new int[n];

	public Record () {

		int n = 5;
	}
	public void readvalues() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students");
		
		for(int i = 0; i < n; i++) {
			
			rnk[i] = s.nextInt();
			name[i] = s.next();
		}
	}
	public void display() {
		
		for(int i = 0; i < n; i++) {
        	System.out.println(name[i] + " " + rnk[i]);
      	}
	}
}
class Rank extends Record {

	int index;
	public Rank() {

		index = 0;
	}
	public void highest() {

		for (int i = 0; i < n; i++) {
		
			if(rnk[i] > rnk[index])
				index = i;
		}
	}
	public void display() {
		
		super.display();      	
      	System.out.println("Highest rankholder with rank" + name[index] + rnk[index]);	
	}
}