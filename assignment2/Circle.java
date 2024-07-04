package assignment2;

public class Circle extends Shape{

	   double radis;
		
		public Circle(double radis) {
			this.radis = radis;
		}
	@Override
	public void draw() {
		System.out.println("Drawing the Circle");
	}

	@Override
	public double calculateArea() {
		double result = 3.1416*radis*radis;
		return result;
	}

}
