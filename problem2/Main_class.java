package assignment2;

import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) {
		
		double redis,side,base,height;
		System.out.print("Enter the Redius of a Circle : ");
		Scanner a = new Scanner(System.in); 
		redis = a.nextDouble();
		Circle circle = new Circle(redis);
		circle.draw();
		System.out.println("The Area of circle is " + circle.calculateArea());
		
		System.out.print("Enter the Side of a Square : ");
		Scanner b = new Scanner(System.in); 
		side = b.nextDouble();
		Square square = new Square(side);
		square.draw();
		System.out.println("The area of Square is "+ square.calculateArea());
		
		
		System.out.print("Enter the Base of a Triangle : ");
		Scanner c = new Scanner(System.in); 
		base = c.nextDouble();
		
		System.out.print("Enter the Height of a Triangle : ");
		Scanner d = new Scanner(System.in); 
		height = d.nextDouble();
		Triangle triangle = new Triangle(base, height);
		triangle.draw();
		System.out.println("The area of Triangle is : "+ triangle.calculateArea());
		
		

	}

}
