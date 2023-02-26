package homework10;

import java.util.Arrays;

public class StringUtil {

	
	/**
	 * 
	 * @param str
	 * @print str
	 */
	
	void firstMethod(String str) {
		String[] arr = str.split("");
		str = "";
		int i = 0;
		
		while(true) {
			if(arr[0].equalsIgnoreCase("o")) {
				str += "o";
				if(arr[1].equalsIgnoreCase("z")) {
					str += "z";
					break;
				}
				break;
			}
			else {
				str += arr[0] + arr[1];
				break;
			}
		}
		System.out.println(str);
		
	}
	
	/**
	 * 
	 * @param str
	 * @param token
	 * @print count
	 */
	void secondMethod(String str,String token) {
		
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
			System.out.println(count);
		
	}
			
	
	/**
	 * 
	 * @param str1
	 * @return true or false
	 */
	boolean palindrom(String str1) {
		StringBuilder stringBuilder = new StringBuilder(str1);
		
		String str2 = stringBuilder.reverse().toString();
		
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param arr
	 * @print arr[i]
	 */
	void fourthMethod(String [] arr) {
		
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].charAt(0) == 'a') {
				System.out.println(arr[i]);
			}
		}
	}
	
	/**
	 * 
	 * @param num
	 * @print str
	 */
	void fifthMethod(int ... num) {
		String str = "";
		for(int i = 0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				str += "e" + num[i] + ",";
			}
			else {
				str += "o" + num[i] + ",";
			}
		}
		System.out.println(str);
	}
	
	/**
	 * 
	 * @param text
	 * @print str
	 */
	void sixthMethod(String text) {
		
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		String str = "";
		String[] textArr = text.split("");
		
		String [] arr = alphabet.split("");
		Arrays.sort(arr);
		
		for(int i = 0; i<textArr.length; i++) {
			if(arr[i] != " ") {
				if(Arrays.binarySearch(arr, textArr[i]) >= 5) {
					str += arr[Arrays.binarySearch(arr, textArr[i]) - 5];
				}
				else {
					str += arr[arr.length - (5-Arrays.binarySearch(arr, textArr[i]))];
				}
			}
		}
		System.out.println(str);
		
	}
	
	/**
	 * 
	 * @param str
	 * @print str.charAt(i)
	 */
	
	void seventhMethod(String str) {
		int startIndex = 0;
		int count = 0;
		String [] arr = str.split("");
		if(palindrom(str)) {
			for(int i = 0; i<arr.length - 1 ; i++) {
				if(str.charAt(i) < str.charAt(i+1)) {
					System.out.println(str.charAt(i));
				}
			}
			
	
		}
	}
	
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @print count
	 */
	void eighthMethod(String str1,String str2) {
		int j=0;
		int count = 0;
		for(int i = 0; i<str1.length(); i++) {
			for(j = 0; j<str2.length();j++) {
				if(str1.charAt(i) == str1.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
			
		
	}
	
	
	

	
	public static void main(String[] args) {
		
		StringUtil stringUtil = new StringUtil();
		
		stringUtil.firstMethod("ozymandia");
		stringUtil.secondMethod("asinin","in");
		System.out.println(stringUtil.palindrom("abcdcba"));
		stringUtil.fourthMethod(new String[] {"aHello", "abello", "bHello"});
		stringUtil.fifthMethod(55,44,33,22);
		stringUtil.sixthMethod("mjqqt");
		stringUtil.seventhMethod("abcddcba");
		stringUtil.eighthMethod("Helo","eslo");
	}

}
