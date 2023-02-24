package homework12.eighth_exercise;

public abstract class AbstractClass {
	
	public AbstractClass () {
		System.out.println("This is constructor of Abstract Class");
	}
	
	public abstract void a_Method();
	
	public void non_Abstract() {
		System.out.println("This is a normal method");
	}
}
