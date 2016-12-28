import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		double n1, n2, n3, n4, n5, n6;
		Scanner inputReader = new Scanner(System.in);

		System.out.println("Enter the radius of the circle: ");
		n1 = inputReader.nextDouble();
		Figure f1 = new Circle(n1);
		f1.findArea();
		f1.findPerimeter();

		System.out.println("---------------------------------------------------------");
		System.out.println("Enter the 2 adjacent sides of the rectangle: ");
		n2 = inputReader.nextDouble();
		n3 = inputReader.nextDouble();
		Figure f2 = new Rectangle(n2, n3);
		f2.findArea();
		f2.findPerimeter();

		System.out.println("---------------------------------------------------------");
		System.out.println("Enter the 3 sides of the Triangle: ");
		n4 = inputReader.nextDouble();
		n5 = inputReader.nextDouble();
		n6 = inputReader.nextDouble();
		Figure f3 = new Triangle(n4, n5, n6);
		f3.findArea();
		f3.findPerimeter();

		inputReader.close();
	}
}
/*
******************************************************************************
Output:
Enter the radius of the circle: 
10
Area of the Circle is: 314.1592653589793
Perimeter of the Circle is: 62.83185307179586
---------------------------------------------------------
Enter the 2 adjacent sides of the rectangle: 
10
10
Area of the Rectangle is: 100.0
Perimeter of the Rectangle is: 40.0
---------------------------------------------------------
Enter the 3 sides of the Triangle: 
10
10
10
Area of the Triangle is: 43.30127018922193
Perimeter of the Triangle is: 30.0
******************************************************************************
*/