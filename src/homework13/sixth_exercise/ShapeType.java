package homework13.sixth_exercise;

public enum ShapeType implements Shape{
	SQUARE {
		@Override
		public int getArea() {
			return getA() * getB();
		}

		@Override
		public int getPerimeter() {
			return getA()*2 + getB()*2;
		}
		
	},
	RECTANGLE {
		@Override
		public int getArea() {
			return getA() * getB();
		}

		@Override
		public int getPerimeter() {
			return getA()*2 + getB()*2;
		}
	};
	
		private int a,b;
		
		void setValues(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
	public	int getA() {
			return a;
		}
	public	int getB() {
			return b;
		}
		
	

}
