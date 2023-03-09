package homework15.mail_exception;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailProgram {
	
	/**
	 * Constructor calls mailThrownException
	 */
	public MailProgram() {
		mailThrownException();
	}

	/**
	 * This method check e-mail address and validate
	 * @param mail
	 * @return true || false
	 */
	boolean validateMail(String mail) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(mail);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
		
	/**
	 * This method input mail and thrown exception if mail is not validate
	 */
	void mailThrownException() {
		
		Scanner sc = new Scanner(System.in);
		String mail = sc.next();
		try {
		if(validateMail(mail)) {
			System.out.println("Good!");
		}else {
			throw new IOException();
		}
		}catch(IOException e) {
			System.out.println("Error, you are entered invalid mail");
		}finally {
			sc.close();
		}
	
	}
	
}
