import java.io.*;

class instanceVariableHiding {

	public static void main(String[] args) {
		
		new example2().displayinfo();
	}
}
class example {
	
	String name = "Penny Hofstadter";
	String address = "4B";
}
class example2 extends example{

	String address = "4A";
	public void displayinfo() {

		example2 info = new example2();
		System.out.println("Name: " + info.name);
		System.out.println("Address: " + info.address);
	}
}