package assignment2;

public class Triangle extends Shape{
	
	double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the Triangle");
		
	}

	@Override
	public double calculateArea() {
		double result = 0.5*base*height;
		return result;
	}

}
