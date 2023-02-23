package homework11;

public class SubClass extends SuperClass{
	
	private String message = "Hello Sub Class";
	
	public SubClass() {
		System.out.println(super.getMessage());
		System.out.println(this.getMessage());
	}
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
