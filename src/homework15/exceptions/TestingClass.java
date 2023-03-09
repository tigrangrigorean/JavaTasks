package homework15.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestingClass {
	
	/**
	 * Constructor calls test
	 */
	public TestingClass() {
		test();
	}
	
	/**
	 * This method calls calls Exceptions
	 */
	void test() {
	
	Scanner sc = new Scanner(System.in);
	
	try {
		int a = sc.nextInt();
		
		if(a>= Integer.MIN_VALUE && a<= Integer.MAX_VALUE) {
			System.out.println(a);
		}
		else {
			throw new NumberException();
		}
	}catch(NumberException e) {
		System.out.println("Number Exception");
	}catch (InputMismatchException e) {
		System.out.println("Input Exception");
	}catch(ClassException e) {
		System.out.println("Class exception");
	}finally {
		sc.close();
	}
}
}
