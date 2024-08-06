package in.thiru.beforejava8;

public class Bus implements Vehicle {
	@Override
	public void startVehicle() {
		System.out.println("Bus class:: startVehicle()");

	}
	
	
	@Override
	public void changeEngine() {
		System.out.println("Bus class:: changeEngine()");
		
	}
}
