package homework15.zero_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZeroProgram {
	
	/**
	 * Constructor calls
	 */
	public ZeroProgram() {
		zeroThrownException();
	}
	
	
	/**
	 * This method divide two numbers
	 */
	void zeroThrownException() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("You are try divide on " + b);
		}catch(NumberFormatException e) {
			System.out.println("You are entered symbol");
		}catch(InputMismatchException e) {
			System.out.println("You are entered undefined symbol");
		}
		catch(Exception e) {
			System.out.println("Undefined exception");
		}finally {
			sc.close();
		}
		
		
	}
	
	

}
