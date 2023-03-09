package homework15.filesearch_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileSearchProgram {
	
	/**
	 * Constructor calls fileSearchThrowException
	 */
	public FileSearchProgram() {
		fileSearchThrowException();
	}
	
	/**
	 * This method gets input and read the file
	 */
	void fileSearchThrowException() {
		System.out.println("Enter the name of file");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		try {
			 FileReader reader = new FileReader(name);
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}finally {
			sc.close();
		}
	}

}
