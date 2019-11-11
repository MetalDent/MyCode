//q 38

import java.io.*;

public class instanceVariableHiding {

	public static void main(String[] args) {
		
		new update().displayinfo();
	}
}
class someInfotoOverwrite {
	
	String name = "Amrita Sundaray";
	String address = "Sarju Town, Nagpur";
}
class update extends someInfotoOverwrite {

	String address = "Vipul Garden, Bhubaneswar";
	public void displayinfo() {

		update info = new update();
		System.out.println("Name: " + info.name);
		System.out.println("Address: " + info.address);
	}
}