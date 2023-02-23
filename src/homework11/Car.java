package homework11;

public class Car {
	
	private int passangerCount;
	private String engineType;
	
	public int getPassangerCount() {
		return passangerCount;
	}
	public void setPassangerCount(int passangerCount) {
		if(passangerCount >= 2) {
		this.passangerCount = passangerCount;
		}
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		if(engineType.matches("^[a-zA-Z]*$")) {
		this.engineType = engineType;
		
		}
	
	}
}
