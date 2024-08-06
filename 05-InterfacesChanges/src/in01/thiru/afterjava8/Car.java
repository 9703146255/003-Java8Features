package in01.thiru.afterjava8;

public class Car implements Vehicle {

	@Override
	public void startVehicle() {

		System.out.println("Car class:: startVehicle()");

	}

	@Override
	public void changeEngine() {
		System.out.println("Car class:: changeEngine()");

	}

}
