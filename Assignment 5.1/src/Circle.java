
public class Circle extends Figure {
	final double pi = Math.PI;
	double area, perimeter;

	public Circle(double dim1) {
		super(dim1);
	}

	@Override
	void findArea() {
		area = pi * Math.pow(dim1, 2);
		System.out.println("Area of the Circle is: " + area);
	}

	@Override
	void findPerimeter() {
		perimeter = 2 * pi * dim1;
		System.out.println("Perimeter of the Circle is: " + perimeter);
	}

}
