//q 34

import java.util.Scanner;

public class superUsage {

	public static void main(String[] args) {
		
		MountainBike obj = new MountainBike(79, 85, 91);
		obj.currentSpeed();
	}
}
	
class Bicycle {
       
  	int gear, speed;
        
   	public Bicycle(int startSpeed, int startGear) {
        	
       	gear = startGear;
       	speed = startSpeed;
   	}
        
   	public void applyBrake(int decrement) {
       	speed -= decrement;
   	}
        
   	public void speedUp(int increment) {
       	speed += increment;
   	}
   	public void currentSpeed() {

   		System.out.println("current speed " + speed);
   	}
}

class MountainBike extends Bicycle {
        
   	public int seatHeight;

   	public MountainBike(int startHeight, int startSpeed, int startGear) {
        
       	super(startSpeed, startGear);
       	seatHeight = startHeight;
   	}   

   	public void setHeight(int newValue) {
        
       	seatHeight = newValue;
   	}
   	public void currentSpeed() {

   		super.currentSpeed();
   		applyBrake(25);
   		speedUp(57);
   		System.out.println("Speed is now " + super.speed);
   	}  
}