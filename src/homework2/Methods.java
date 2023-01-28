package homework2;

public class Methods {
	
	// 1
	static int firstMethod(int a, int b) {
		return 0;	
	}
	
	// 2 
	static void secondMethod() {
		
	}
	
	// 3
	static void thirdMethod(boolean a, boolean b) {
		System.out.println("Hello World");
	}
	
	// 4
	static char fourthMethod(char a) {
		return a;
	}
	
	// 5
	static float fifthMethod(float a, float b) {
		return b;
	}
	
	//6
	static void recursionMethod(int n) {
		
		if(n!= 0) {
			System.out.println(n);
			recursionMethod(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(firstMethod(2, 5));
		secondMethod();
		thirdMethod(true,false);
		System.out.println(fourthMethod('a'));
		System.out.println(fifthMethod(11.5f , 2.7f));
		recursionMethod(5);
		
	}

}
