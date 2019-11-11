//q44

import java.io.*;

public class inheritedClassObject {

	public static void main(String[] args) {
		
		child obj = new child();
		obj.display();
	}
}
class parent {

	String name = "Susmita";
	String surname = "Sundaray";
}

class child extends parent {

	String cName = "Amrita";

	void display(){

		child info = new child();
		System.out.println(info.cName + " " + info.surname);
	}
}