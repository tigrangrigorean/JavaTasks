package homework12;

import homework12.eighth_exercise.SubClass;
import homework12.fifth_exercise.Human;
import homework12.fifth_exercise.Man;
import homework12.fourth_exercise.Arithmetic;
import homework12.nineth_exercise.Animals;
import homework12.nineth_exercise.Cat;
import homework12.nineth_exercise.Dog;
import homework12.seventh_exercise.A;
import homework12.seventh_exercise.B;
import homework12.first_exercise.ChildOne;
import homework12.first_exercise.ChildSecond;
import homework12.first_exercise.Parent;

public class Main {

	public static void main(String[] args) {
		
		Parent childOne = new ChildOne();
		Parent childSecond = new ChildSecond();
		Arithmetic arithmetic = new Arithmetic();
		
		childOne.message();
		childSecond.message();
		System.out.println(arithmetic.square(2, 3));

		Human man = new Man();
		man.breathe();
		
		A a = new A(35,37,100);
		B b = new B(35,37,12,99);
		
		SubClass subClass = new SubClass();
		subClass.a_Method();
		subClass.non_Abstract();
		
		Animals dogs = new Dog();
		Animals cats = new Cat();
		
		dogs.dogs();
		cats.cats();
	}

}
