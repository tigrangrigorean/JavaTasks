package homework13;

import homework13.first_exercise.data.Planets;
import homework13.fourth_exercise.NewPlanets;
import homework13.second_exercise.DaysOfWeek;
import homework13.third_exercise.Shapes;

public class Main {

	public static void main(String[] args) {
		
		Planets planet = Planets.MARS;
		
		System.out.println(planet.getName());
		System.out.println(planet.getYearLength());
		
		DaysOfWeek days = DaysOfWeek.THURSDAY;

		System.out.println(days.getNumberOfDay());
		
		Shapes shapes = Shapes.TRIANGLE;
		shapes.sum(5,4,3);
		
		NewPlanets newPlanets = NewPlanets.MARS;
		System.out.println(newPlanets.getDistance());
	}

}
