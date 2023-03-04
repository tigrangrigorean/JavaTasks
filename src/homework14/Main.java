package homework14;

import homework14.first_exercise.RunClass;
import homework14.second_exercise.PrintClass;

public class Main {

	public static void main(String[] args) {
		
		RunClass runClass = new RunClass();
		runClass.changeState();
		
		PrintClass printClass = new PrintClass();
		printClass.print();

	}

}
