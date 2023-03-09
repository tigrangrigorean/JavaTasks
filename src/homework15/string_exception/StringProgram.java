package homework15.string_exception;

import java.util.Scanner;

public class StringProgram {
	
	/**
	 * Constructor calls stringThrowException()
	 */
	public StringProgram() {
		stringThrowException();
	}
	
	/**
	 * This method inputs String and throws exception if string empty or null
	 */
	void stringThrowException() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter something");
		
		try {
			String str = sc.next();
			if(str == null || str.isEmpty()) {
				throw new NullPointerException();
			}
			else {
				str = str.toUpperCase();
				str.charAt(0);
				str = str.toLowerCase();
				System.out.println(str);
			}
		}catch(NullPointerException e) {
			System.out.println("String is empty or null");
		}finally {
			sc.close();
		}
		
	}

}
