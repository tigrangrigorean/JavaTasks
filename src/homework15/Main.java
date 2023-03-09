package homework15;

import homework15.age_exception.AgeProgram;
import homework15.array_integers_exception.ArrayProgram;
import homework15.exceptions.TestingClass;
import homework15.file_exception.FileProgram;
import homework15.filesearch_exception.FileSearchProgram;
import homework15.integer_exception.NumberProgram;
import homework15.mail_exception.MailProgram;
import homework15.square_exception.SquareProgram;
import homework15.string_exception.StringProgram;
import homework15.zero_exception.ZeroProgram;

public class Main {

	public static void main(String[] args) {
		
		NumberProgram numberProgram = new NumberProgram();
		ArrayProgram arrayProgram = new ArrayProgram();
		ZeroProgram zeroProgram = new ZeroProgram();
		FileProgram fileProgram = new FileProgram();
		SquareProgram squareProgram = new SquareProgram();
		TestingClass testingClass = new TestingClass();
		AgeProgram ageProgram = new AgeProgram();
		MailProgram mailProgram = new MailProgram();
		FileSearchProgram fileSearchProgram = new FileSearchProgram();
		StringProgram stringProgram = new StringProgram();
		
	}

}
