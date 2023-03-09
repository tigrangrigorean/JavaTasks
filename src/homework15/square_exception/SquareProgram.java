package homework15.square_exception;

public class SquareProgram {
	
	/**
	 * Constructor calls squareThrowException
	 */
	public SquareProgram() {
		squareThrowException(-1);
	}
	
	/**
	 * This method calculate square root
	 * @param num1
	 */
	void squareThrowException(int num1) {
		try {
		if(num1 >= 0) {
			System.out.println(Math.sqrt(num1));
		}
		else {
			throw new NumberFormatException();
		}
		}catch(NumberFormatException e) {
			System.out.println("Invalid number");
		}finally {
			System.out.println("Goodbye");
		}
		
	}

}
