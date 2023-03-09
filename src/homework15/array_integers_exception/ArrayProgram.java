package homework15.array_integers_exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayProgram {
	
	/**
	 * Constructor calls arrayThrownException
	 */
	public ArrayProgram() {
		arrayThrownException();
	}
	
	
	/**
	 * This method get's 5 values, and print sum
	 */
	void arrayThrownException() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int[] arr = new int[5];
		try {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
			}catch(InputMismatchException e) {
				System.out.println("InputMisMatchException");
		}finally {
			sc.close();
		}
	}
	
	
}
