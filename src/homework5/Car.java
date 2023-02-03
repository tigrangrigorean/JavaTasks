package homework5;

public class Car {
	String model;
	String color;
	int currentSpeed;
	boolean isEngineStart;
	
	
	public Car(String model, String color, int currentSpeed) {
		this.model = model;
		this.color = color;
		this.currentSpeed = currentSpeed;
	}
	
	void stopEngine() {
		isEngineStart = false;
	}
	void startEngine() {
		isEngineStart = true;
	}


	public static void main(String[] args) {
		
		Car Mercedes1 = new Car("C203", "Black", 0);
		Car Mercedes2 = new Car("S505", "White", 0);

	}

}
