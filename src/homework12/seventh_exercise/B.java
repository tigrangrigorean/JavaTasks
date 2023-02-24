package homework12.seventh_exercise;

public class B extends Marks{

	public B() {
		
	}
	
	public B(int a, int b, int c, int d) {
		System.out.println(getPercentage(a,b,c,d));
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
