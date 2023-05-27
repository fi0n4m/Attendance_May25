
//superclass
class Plane extends Vehicles {

	//returns all objects that represent the base class
	Plane(int speed, String color, double price) {
		super(speed, color, price); 
	}
}

class U_2_Spy_Plane extends Plane {
	private int wingSpan;
	
	U_2_Spy_Plane(int speed, String color, double price, int wingSpan) {
		super(speed, color, price); 
		this.wingSpan = wingSpan;
	}
	
	public void fly() {
		System.out.println("U2 Spy Plane is started to fly...");
	}
		
	@Override
	public void stop() { //overriding stop method
		System.out.println("U-2 Spy Plane has stopped...");
	}
}
