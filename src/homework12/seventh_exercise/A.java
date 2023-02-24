package homework12.seventh_exercise;

public class A extends Marks {

	public A() {
		
	}
	
	public A (int a, int b , int c) {
		System.out.println(getPercentage(a,b,c));
	}
	
	@Override
	public double getPercentage(int ... mark) {
		double summ = 0.0;
		for(int i = 0; i<mark.length; i++) {
			summ += mark[i];
		}
		summ /= mark.length;
		return summ;
	}

}
