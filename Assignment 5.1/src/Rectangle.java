
public class Rectangle extends Figure {

	private double dim2, area, perimeter;

	public Rectangle(double dim1, double dim2) {
		super(dim1);
		this.dim2 = dim2;
	}

	@Override
	void findArea() {
		area = dim1 * dim2;
		System.out.println("Area of the Rectangle is: " + area);
	}

	@Override
	void findPerimeter() {
		perimeter = 2 * (dim1 + dim2);
		System.out.println("Perimeter of the Rectangle is: " + perimeter);
	}

}
