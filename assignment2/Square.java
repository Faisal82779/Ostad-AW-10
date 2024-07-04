package assignment2;

public class Square extends Shape{

   double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the Square");
		
	}

	@Override
	public double calculateArea() {
		double result =side*side;
		return result;
	}

}
