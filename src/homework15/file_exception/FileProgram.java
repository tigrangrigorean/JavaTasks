package homework15.file_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileProgram {
	
	/**
	 * Constructor calls fileThrowException
	 */
	public FileProgram() {
		fileThrowException();
	}

	/**
	 * This method try to open file
	 */
	void fileThrowException() {
		try {
			 FileReader reader = new FileReader("notes3.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	
}
