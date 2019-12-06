import java.io.*;

class inheritedClassObject {

	public static void main(String[] args) {
		
		child obj = new child();
		obj.display();
	}
}
class parent {

	String name = "Mary";
	String surname = "Cooper";
}

class child extends parent {

	String cName = "Sheldon";

	void display(){


		System.out.println(cName + " " + surname);
	}
}
