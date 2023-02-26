package homework1;
import java.util.Scanner;


public class DataTypes {

	public static void main(String[] args) {
		
		// 1		
		/**
		 * Print a & b
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers separated by spaces");
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		sc.close();	
		System.out.println(a + " : " + b);
		
		// 2
		/**
		 * Print  c & d
		 */
		short c = 5;
		short d = 7;
		System.out.println(c + " : " + d);
		
		// 3
		/**
		 * Print e & f
		 */
		int e = 2;
		int f = 11;
		System.out.println(e + " : " + f);
		
		// 4
		/**
		 * Print g & h
		 */
		long g = 55l;
		long h = 77l;
		System.out.println(g + " : " + h);
		
		// 5
		/**
		 * Print Byte,SHort,Integer,Long - Min Values & Max Values
		 */
		System.out.println("Byte Max Value = " + Byte.MAX_VALUE + " : Byte Min Value = " + Byte.MIN_VALUE);
		System.out.println("Short Max Value = " + Short.MAX_VALUE + " : Short Min Value = " + Short.MIN_VALUE);
		System.out.println("Integer Max Value = " + Integer.MAX_VALUE + " : Integer Min Value = " + Integer.MIN_VALUE);
		System.out.println("Long Max Value = " + Long.MAX_VALUE + " : Long Min Value = " + Long.MIN_VALUE);
		
		// 6
		/**
		 * Print j & k
		 */
		float j = 11.1f;
		float k = 15.5f;
		System.out.println(j + " : " + k);
		
		// 7
		/**
		 * Print l & m
		 */
		double l = 31.11231;
		double m = 5.511234;
		System.out.println(l + " : " + m);
		
		// 8
		/**
		 * Print double & float - max values & min values
		 */
		System.out.println("Float Max Value = " + Float.MAX_VALUE + " : Float Min Value = " + Float.MIN_VALUE);
		System.out.println("Double Max Value = " + Double.MAX_VALUE + " : Double Min Value = " + Double.MIN_VALUE);
		
		
		// 9
		/**
		 * Init floats and doubles
		 */
		float firstFloat = 12.345f;
		float secondFloat = 3456.091f;
		double firstDouble = 34.567839023;
		double secondDouble = 8923.1234857;
		
		// 10
		/**
		 * Print n & o
		 */
		char n = '+';
		char o = '-';
		System.out.println(n + " " + o);
		
		// 11
		/**
		 * Print num w/o number
		 */
		char t = '\u0009';
		System.out.println("Char equals = " + (int) t);
		
		// 12
		/**
		 * Print p & q
		 */
		boolean p = true;
		boolean q = false;
		System.out.println(p + " : " + q);
		
		
		// 13 
		/**
		 * Error fix;
		 */
		 // Error | Integer can't contain Long.
	    /* int year = 201l;
	    * System.out.print (year);
	    */ 
		
		// 14
		/**
		 * Print bb
		 */
		int aa = 7;
		long bb = aa;
		System.out.println(bb);
		
		// 15
		/**
		 * AutoCasting
		 * Print myDouble
		 */
		int myInt = 7;
		double myDouble = myInt;
		System.out.println(myDouble);
		
		// 16
		/**
		 * Narrowing casting
		 * Print ii
		 */
		double dd = 9.78;
		int ii = (int)dd;
		System.out.println(ii);
		
		// 17
		/**
		 * Print Narrowing casting
		 */
		int ff = 9999;
		byte gg = (byte) ff;
		System.out.println(gg);
		
		// 18
		/**
		 * Error fix
		 */
	/*	long max = 3123456789l;
		double d = 1000.00;
		char i = 'i'; char j='j'; char ij = (char) (i+j);
		int a7 = 8;
		long h = 8;
		int n, m = 11; n = m;
		
		*/
	}

}
