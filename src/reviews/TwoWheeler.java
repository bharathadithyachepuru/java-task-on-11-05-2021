package reviews;

// Sample program for Abstract class and method

abstract class Vehicles {
	
	 public void noofwheels() {
		 
	 }
}

public class TwoWheeler extends Vehicles {
	
	public void noofwheels() {
		
		System.out.println("No of Wheels are two");
	}

	public static void main(String[] args) {
		
		TwoWheeler wheels = new TwoWheeler();
		
		wheels.noofwheels();


	}

}
