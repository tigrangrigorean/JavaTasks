package homework4;

import java.util.Scanner;

public class StatementsUtil {
	
	// 1
	void firstMethod(int x) {
		if(x % 2 == 0 && x != 0) {
			System.out.println("X is couple");
		}
		else if(x == 0) {
			System.out.println("X is 0");
		}
		else {
			System.out.println("X is odd");
		}
	}
	
	// 2
	void secondMethod(int x) {
		if(x <0) {
			System.out.println("x < 0");
		}
		else if(x == 0) {
			System.out.println("x = 0");
		}
		else {
			System.out.println("x > 0");
		}
	}
	
	// 3
	void thirdMethod(int x) {
		if((x < 8 & x > 5) | (x < 20 & x>15)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	// 4
	void forthMethod(int x) {
		if(x%5 == 0 && x%7 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	// 5
	void fifthMethod(int x) {
		if(x >= 100 && x <=999) {
			int b = (x / 10)%10;
			if(b == 7) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		else {
			System.out.println("Enter number > 100 and < 999");
		}
	}
	// 6
	void sixthMethod(int x, int y) {
		
		if(x < 5 & y < 5) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	// 7
	void seventhMethod(int x , int y , int z) {
		
		if(x > y && x > z) {
			System.out.println(x);
		}
		else if(y > x && y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}
	
	// 8
	void eighthMethod(int year) {
		if((year % 4 == 0 && year%100 != 0 )|| year%400 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
// 10)	 int x = 0;
//     while (x++ < 10) {
//       if(x == 8) {
//     	  break;
//       }
//    }
//    System.out.println(x);
	
	
// 11) int x = 2;
//    int y = 5;
//    while(x < 10) {
//    y++;
//	  x++;
//    }
	
	
// 12) int x = 15;
//    while (x > 10) {
//       x--;
//    } 
//    System.out.println(x);
//	
	
	
	// 11
	void ninthMethod() {
		
		for(int i = 1; i<=200; i++) {
			System.out.println(i);
		}
		
	}

	// 12
	
	void tenthMethod(int num) {
		
		String a = Integer.toString(num);
		char b = a.charAt(0);
		System.out.println(b);
	}
	
	// 13
	
	void eleventhMethod() {
		int x = 1;
		int y = 0;
		
		while(x != 5 & y != 10) {
			
			x++;
			y++;
			System.out.println(x + y);
		
		}
		
	}
	
	// 14
	void fourteenthMethod() {
		
		for(int i = 1; i<5; i++) {
			for(int j = 1; j<7; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	
	// 15
	void fifteenthMethod() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = 1; i<=n; i++) {
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	// 16
	void sixteenthMethod(long n) {
		
		long sum = 1l;
		
		for(int i = 0; i<=n; i++) {
			if(i >= 10 && i <=99) {
				if(i%2 == 0) {
					sum*=i;
				}
			}
		}
		System.out.println(sum);
	}
	
	// 17
	void seventeenthMethod(int n) {
		
		double b = (1 + n) / 2;
		
		System.out.println(b);
		
	}
	
	// 18
	
	void eighteenthMethod(int n) {
		
		if(n>=10000 && n <=99999) {
			
			int a = n / 10000;
			int b = n / 1000 % 10;
			int c = n / 100 % 10;
			int d = n / 10 % 10;
			int e = n % 10;
			
			System.out.println(a + b + c + d + e);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		StatementsUtil statementsUtil = new StatementsUtil();
		
		statementsUtil.firstMethod(2);
		statementsUtil.secondMethod(12);
		statementsUtil.thirdMethod(15);
		statementsUtil.forthMethod(35);
		statementsUtil.fifthMethod(575);
		statementsUtil.sixthMethod(3, 4);
		statementsUtil.seventhMethod(22, 34, 12);
		statementsUtil.eighthMethod(1992);
		statementsUtil.ninthMethod();
		statementsUtil.tenthMethod(323);
		statementsUtil.eleventhMethod();
		statementsUtil.fourteenthMethod();
		statementsUtil.fifteenthMethod();
		statementsUtil.sixteenthMethod(31);
		statementsUtil.seventeenthMethod(7);
		statementsUtil.eighteenthMethod(42351);
		
	
		
	}

}
