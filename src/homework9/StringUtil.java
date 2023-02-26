package homework9;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {
	
	/**
	 * 
	 * This method concats String
	 * @print stringBuilder
	 */
	void firstMethod() {
		String a = "Hello";
		String b = "World";
		int c = 1;
		int d = 2;
		
		System.out.println(a + b);
		System.out.println(c + d + a + b);
		System.out.println(Integer.toString(c) + d + a + b);
		System.out.println(a + c + d + b);
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		
		stringBuilder.append(b);
		System.out.println(stringBuilder);
		stringBuilder.append(c);
		stringBuilder.append(d);
		System.out.println(stringBuilder);
	}
	
	
	/**
	 * 
	 * @param str
	 * @return array of words
	 */
	
	String secondMethod(String str) {
		
		String arr[] = str.split(" ");
		
		for(int i = 0; i< arr.length -1; i++) {
			arr[i]+= "\n";
		}
		
		return Arrays.toString(arr);
	
	}
	
	/**
	 * 
	 * @param str
	 * @return String type
	 */
	
	String thirdMethod(String str) {
		
		
		String[] arr = str.split("");
		str = "";
		
		for(int i = arr.length-1;i>=0;i--) {
			str += arr[i];
		}
		
		return str;
		
	}

	
	/**
	 * 
	 * @param str
	 * @param token
	 * @return int Count
	 */
	
	int fourthMethod(String str, String token) {
		
	int count = 0;
	int j = 0;
		
		String[] arr1 = str.split("");
		String[] arr2 = token.split("");
		
		for(int i = 0; i<arr1.length;i++) {
			j = 0;
			for(j = 0; j<arr2.length-1; j++) {
				if(arr1[i].equals(arr2[j]) ) {
					i++;
					j++;
					if(arr1[i].equals(arr2[j])) {
						count++;
						j = 0;
					}
				}
			}
		}
		
		return count;
	}
	
	/**
	 * 
	 * @param str
	 * @print str
	 */
	void fifthMethod(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}
	
	
	/**
	 * @print str
	 */
	void sixthMethod() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		sc.close();
	
		for(int i = 0; i<str.length();i++) {
			if(str.length()<20) {
				for(int j = 0; j<20-str.length();j++) {
					str += "*";
				}
			}
		}
		System.out.println(str);

	}
	
	/**
	 * 
	 * @param str
	 * @print str
	 * @print stringBuilder
	 */
	
	void seventhMethod(String str) {
		String[] arr = str.split("a");
		StringBuilder stringBuilder = new StringBuilder(str);
		str = "";
	for(int i = 0; i<arr.length; i++) {
		str += arr[i];
	}
		System.out.println(str);
		
		for(int i = 0; i<stringBuilder.length();i++) {
		if(stringBuilder.charAt(i) == 'a') {
			stringBuilder.deleteCharAt(i);
		}
		}
		System.out.println(stringBuilder);
		
	}
	
	/**
	 * 
	 * @param str
	 * @print str
	 * @print stringBuilder
	 */
	
	void eighthMethod(String str) {
		String[] arr = str.split("a");
		StringBuilder stringBuilder = new StringBuilder(str);
		str = "";
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == "a") {
				arr[i] = "*";
			}
			str+=arr[i];
		}
		
		System.out.println(str);
		
		for(int i = 0; i<stringBuilder.length();i++) {
			if(stringBuilder.charAt(i) == 'a') {
				stringBuilder.setCharAt(i, '*');
			}
		}
		System.out.println(stringBuilder);
	}
	
	/**
	 * 
	 * @param str
	 * @print arr[index]
	 */
	
	void ninethMethod(String str) {
		String[] arr = str.split(" ");
		int len = 0;
		int index = 0;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i].length() > len) {
				len =arr[i].length();
				index = i;
			}
		}
		System.out.println(arr[index]);
	}
	
	/**
	 * 
	 * @param str
	 * @print index
	 */
	void tenthMethod(String str) {
		String[] arr = str.split("");
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("a")) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
	
	/**
	 * 
	 * @param str
	 * @param n
	 * @print arr[i]
	 */
	
	void eleventhMethod(String str,int n) {
		String[] arr = str.split("");
		
		
		for(int i = 0; i<arr.length; i++) {
			if(i == n) {
				break;
			}
			System.out.print(arr[i]);
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return true or false
	 */
	boolean twelfthMethod(String str) {
		
		if(!str.isEmpty() && str != null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * 
	 * @param str
	 * @print arr[index]
	 */
	void thirteenthMethod(String str) {
		
		String[] arr = str.split(",");
		int len = 0;
		int index = 0;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i].length() > len) {
				len =arr[i].length();
				index = i;
			}
		}
		System.out.println(arr[index]);
		
	}
	
	public static void main(String[] args) {

		StringUtil stringUtil = new StringUtil();
		
		stringUtil.firstMethod();	
		System.out.println(stringUtil.secondMethod("Hi my friend"));
		System.out.println(stringUtil.thirdMethod("Hi my friend"));
		System.out.println(stringUtil.fourthMethod("We are living in an yellow submarine. We don't  have anything", "in"));
		stringUtil.fifthMethod("hello");
		stringUtil.sixthMethod();
		stringUtil.seventhMethod("We are living in an yellow submarine. We don't  have anything");
		stringUtil.eighthMethod("We are living in an yellow submarine. We don't  have anything");
		stringUtil.ninethMethod("We are living in an yellow submarine. We don't  have anything");
		stringUtil.tenthMethod("We are living in an yellow submarine. We don't  have anything");
		stringUtil.eleventhMethod("We are living in an yellow submarine. We don't  have anything", 10);
		System.out.println(stringUtil.twelfthMethod(""));
		stringUtil.thirteenthMethod("We, are, living, in an, yellow, submarine, We don't,  have anything");
	}

}
