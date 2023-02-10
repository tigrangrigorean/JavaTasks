package homework8;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
	
	void firstMethod() {
		int[] arr = new int[] {1,4,2,-3};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void secondMethod() {
		short[] arr = new short[] {1,2,3};
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	void thirdMethod() {
		long[] arr = new long[] {1l,2l,12l,4l};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
	
	void fourthMethod() {
		float[] arr = new float[] {1.7f,2.1f,0.5f,3.4f};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
	
	void fifthMethod() {
		int[] n = new int[] {1,3,5,7,9};
		int[] m = n;
		
		System.out.println(Arrays.toString(m));
	}
	
	void sixthMethod() {
		int[] firstArr = new int[] {1,2,3,4 };
		int[] secondArr = new int[] {4,3,2,1};
		int[] thirdArr = new int[4];
		
		for(int i = 0; i<thirdArr.length;i++) {
			thirdArr[i] = firstArr[i] + secondArr[i];
		}
		System.out.println(Arrays.toString(thirdArr));
	}
	
	void seventhMethod() {
		int count = 0;
		
		int[] arr = new int[] {5,4,2,5,5,7,3};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == 5) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	void eighthMethod() {
		
		int a,b,c;
		
		int[] arr = new int[] {1,5,6,4};
		
		for(int i = 0; i<arr.length;i++) {
			
			if(i < arr.length) {
				a = arr[i];
			}
			else {
				break;
			}
			if(i+1 <arr.length) {
				b = arr[i+1];
			}
			else {
				b = arr[0];
			}
			if(i+2 < arr.length) {
				c = arr[i+2];
			}
			else if (i == 3){
				
				c = arr[1];
			}
			else {
				c = arr[0];
			}
			
			
			System.out.println(a + " " + b + " " + c);
		}
	}
	
	void ninethMethod() {
		Integer[] arr = new Integer[] {6,4,1,5,9,7,1};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayUtil arrayUtil = new ArrayUtil();

		//arrayUtil.firstMethod();
		//arrayUtil.secondMethod();
		//arrayUtil.thirdMethod();
		//arrayUtil.fourthMethod();
		//arrayUtil.fifthMethod();
		//arrayUtil.sixthMethod();
		//arrayUtil.seventhMethod();
		//arrayUtil.eighthMethod();
		//arrayUtil.ninethMethod();
	}

}
