package homework11;

public class Child extends Parent{

	public Child() {
		super.showMessage();
		this.showMessage();
	}
	
	@Override
	void showMessage() {
		System.out.println("Hello Child Class");
	}
	
}
