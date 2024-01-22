
class Shape {
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape {
	private int width, height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}
}

public class OverrideMain {
	public static void main(String[] args) {
		Shape[] shapeArr = { new Circle(100), new Rectangle(10, 10), new Triangle(10, 10) }; 
		double sum = 0;
		for (Shape shape : shapeArr) {
			sum = sum++;
			shape.getArea();

		}
		System.out.println(sum + "\n");
		Circle c1 = new Circle(100);
		System.out.println(c1.getArea());
		Rectangle r1 = new Rectangle(10, 10);
		System.out.println(r1.getArea());
		Triangle r2 = new Triangle(10, 10);
		System.out.println(r2.getArea());
		double total = r1.getArea() + c1.getArea() + r2.getArea();
		System.out.println(total);

		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry) {
			f.print();
		}
	}
}
