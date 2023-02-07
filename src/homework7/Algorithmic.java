package homework7;

import java.util.Random;
import java.util.Scanner;

public class Algorithmic {

	void firstMethod() {
		
		int number;
		
		do {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if(number >= 0) {
				for(int i = 0; i<=10; i++) {
					System.out.println(number + " x " + i + " = " + (number * i) );
				}
			}
		}while(number<0);
	}
	
	void secondMethod() {
		
      Scanner sc = new Scanner(System.in);
      int firstNum = sc.nextInt();
      int secondNum = sc.nextInt();
      int rise = firstNum;
      if (secondNum > 0) {
          for (int i = 1; i < secondNum; i++) {
              rise *= firstNum;
          }
          System.out.println(rise);
      } else {
          for (int i = 1; i < -secondNum; i++) {
        	  rise *= firstNum;
          }
          double num =  1.0 / (double) rise;
          System.out.println(num);
      }
		
	}
	
	void thirdMethod(int num) {
		
		String s = Integer.toString(num);
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		num = Integer.parseInt(s);
		System.out.println(num);
		
		
	}
	
	void fourthMethod() {
		System.out.println("Enter the positive number");
		Scanner sc = new Scanner(System.in);
		
		 int num = sc.nextInt();
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	}
	
	void fifthMethod() {
		
		char a = 0;
		int xy = 0;
		int sum = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int y=  sc.nextInt();
			
			xy = x + y;
			sum += xy;
			System.out.println(sum);
			
			System.out.println("Do you want to add again? Yes - Y , No - Nothing ");
			a = sc.next().charAt(0);
			
			
		}while(a == 'y');
	}
	
	void sixthMethod() {
		Scanner sc = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		char a;
		
		
		do {
			int num = sc.nextInt();
			
			if(num >0 ) {
				positive++;
			}
			else if(num == 0) {
				zeros++;
			}
			else {
				negative++;
			}
			
			System.out.println("If you want to repeat press y");
			a = sc.next().charAt(0);
			
		}while(a == 'y');
		
		System.out.println("Positive : " + positive);
		System.out.println("Negative : " + negative);
		System.out.println("Zeros : " + zeros);
		
	}
	
	void seventhMethod() {
	Scanner sc = new Scanner(System.in);
		
		
		char a;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int temp;
		
		
		do {
			
			temp = sc.nextInt();
			
			if(temp > largest) {
				largest = temp;
			}
			if(temp < smallest) {
				smallest = temp;
			}
			
			
			
			System.out.println("If you want to repeat press y");
			a = sc.next().charAt(0);
			
			
		}while(a == 'y');
		System.out.println("Largest number = : " + largest);
		System.out.println("Largest number = : " + smallest);
	}
	
	void eighthMethod() {
		
		 int n, count = 0, a, b, c, sum = 0;
		 
	        for(int i = 1; i <= 500; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }
	}
	
	void ninethMethod() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=n; i++) {
			sum += 1/i;
		}
		System.out.println(sum);
		
	}
	
	void eleventhMethod() {
		Random rand = new Random();
		int randsub = rand.nextInt(1,10);
		boolean flag = false;
		while(!flag) {
			System.out.println("Enter your number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == randsub) {
				System.out.println("Your number is true : " + num);
				flag = true;
			}
			else if(num < randsub) {
				System.out.println("Your number is small.");
			}
			else {
				System.out.println("Your number is large");
			}
			
		}
	}
	
	void twelvethMethod() {
		for(int i = 0; i<=5; i++) {
			for(int j = 0; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	void thirteenthMethod() {
		
		for (int i = 1; i <= 5; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	
	void fourteenthMethod() {
		   
		    
	        for(int i=0; i<5; i++) 
	        { 
	           int num=1; 
	            for(int j=0; j<=i; j++)
	            { 
	                System.out.print(num+ " "); 

	                num++; 
	            } 
	            System.out.println(); 
	        } 
	}
	
	void fifteenthMethod() {
	    
		int firstNum = 5;
        int sum = 2;
        
        for (int i = 0; i < 5; i++) {
        	
            for (int j = 0; j < firstNum; j++) {
            	
                if (j <= firstNum - sum) {
                    System.out.print("  ");
                    
                } else {
                	
                    int symbol = i + 1;
                    if (symbol > 9) {
                        symbol %= 10;
                    }
                    
                    System.out.print(symbol + " ");
                }
            }
            firstNum++;
            sum += 2;
            System.out.println();
        }

	}
	
	
	public static void main(String[] args) {
		Algorithmic ex = new Algorithmic();
		
		//ex.firstMethod();
		//ex.secondMethod();
		//ex.thirdMethod(12345);s
		//ex.fourthMethod();
		//ex.fifthMethod();
		//ex.sixthMethod();
		//ex.seventhMethod();
		//ex.eighthMethod();
		//ex.ninethMethod();
		//ex.tenthMethod();
		//ex.eleventhMethod();
		//ex.twelvethMethod();
		//ex.thirteenthMethod();
		//ex.fourteenthMethod();
		//ex.fifteenthMethod();
	}

}
