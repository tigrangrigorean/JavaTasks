package homework15.age_exception;

import java.io.IOException;
import java.util.Scanner;

public class AgeProgram {
	
	/**
	 * Constructor calls ageThrownException
	 */
	public AgeProgram() {
		ageThrownException();
	}
	
	/**
	 * This method print age
	 */
	void ageThrownException() {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age >120 || age < 0) {
				throw new IOException();
			}
			else {
				System.out.println("Your age is : " + age);
			}
		}catch(IOException e) {
			System.out.println("Exception - You are entered invalid number");
		}finally {
			sc.close();
		}
	}
	
}
