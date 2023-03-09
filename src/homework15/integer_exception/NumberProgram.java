package homework15.integer_exception;

import java.io.IOException;
import java.util.Scanner;

public class NumberProgram {

	/**
	 * Constructor calls the method readAndThrowsException()
	 */
	public NumberProgram() {
		readAndThrowsException();
	}
	
	/**
	 * This method gets the a and throw new exception if a is 0
	 */
	void readAndThrowsException() {
		System.out.println("Enter the num ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		try {
			if(a != 0) {
			a = a * -1;
			System.out.println(a);
			}
			else {
				throw new IOException();
			}
			
		}catch(IOException e) {
			System.out.println("Error, you are write " + a);
		}finally {
			sc.close();
		}
		
		
	}
	
}
