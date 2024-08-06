package in01.thiru.afterjava8;

public interface Vehicle {

	// abstract method
	public abstract void startVehicle();

	// abstract method in interfaces by default abstract will be added
	// if we add these method we need to override and use otherwise we will get
	// compile time error
	public void changeEngine();

	default void color() {

		System.out.println("Vehicle :: color() default method");

	}

	static void speed() {
		System.out.println("Vehicle :: speed() static method");
	}

}
