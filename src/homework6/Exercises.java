package homework6;

import java.util.Random;

public class Exercises {
	
	boolean firstMethod(Integer big, Integer small, Integer goal) {
		
		boolean result = false;
		if (big * 5 >= goal) {
		    if (small >= goal % 5)
		        result = true;
		} else {
		    if (small >= goal - big * 5) {
		        result = true;
		    }
		}
		return result;
	}
	
	
	int secondMethod(int number) {
	
		int i;
		for ( i = 2; i <= number; i++) {
			if (number % i == 0) {
				number /= i; 
				i--;
		}
	} 
		return i; 
}
		
	
	
	void thirdMethod() {
		double num = Math.random() * 100;
		int sub = (int) num;
		
		if(sub % 2 == 0) {
			System.out.println(sub + " num is even");
		}
		else {
			System.out.println(sub + " num is odd");
		}
		
	}
	
	void fourthMethod() {
		
		int smallest = 100;
		int largest = 0;
		
		for(int i = 0 ; i<= 10; i++) {
			int num = new Random().nextInt(100);
			if(num > largest) {
				largest = num;
			}
			if(num < smallest) {
				smallest = num;
			}
		}
		System.out.println("the smallest num: " + smallest);
		System.out.println("the largest num: " + largest);
	}

	public static void main(String[] args) {
		
		Exercises ex = new Exercises();
		System.out.println(ex.firstMethod(2, 3, 13));
		System.out.println(ex.secondMethod(455));
		ex.thirdMethod();
		ex.fourthMethod();
	}

}
