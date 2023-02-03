package homework5;

public class City {
	
	String name;
	int population;

	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public static void main(String[] args) {
		
		City Yerevan = new City("Yerevan", 700000);
		City Moscow = new City("Moscow", 120000);
		City NewYork = new City("New York", 100000);
		City Paris = new City("Paris", 1700000);

	}

}
