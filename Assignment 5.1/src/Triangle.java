
public class Triangle extends Figure {
	private double dim2, dim3, area, perimeter, semiperimeter;

	public Triangle(double dim1, double dim2, double dim3) {
		super(dim1);
		this.dim2 = dim2;
		this.dim3 = dim3;
	}

	@Override
	void findArea() {
		semiperimeter = (dim1 + dim2 + dim3) / 2;
		area = Math.sqrt(semiperimeter * (semiperimeter - dim1) * (semiperimeter - dim2) * (semiperimeter - dim3));
		System.out.println("Area of the Triangle is: " + area);
	}

	@Override
	void findPerimeter() {
		perimeter = dim1 + dim2 + dim3;
		System.out.println("Perimeter of the Triangle is: " + perimeter);
	}

}
