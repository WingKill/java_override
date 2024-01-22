
public class CircleTest {

	public static void main(String[] args) {

		Object obj = new Circle6(10);

		System.out.println(obj); // 출력: 넓이는 314.134 입니다. (예시)

		Shape1 donut = new Circle4(10); // 반지름이 10인 원 객체

		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}

interface Shape1 {
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle4 implements Shape1 {
	private double radius;

	public Circle4(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		if(radius % 10 == 0) {
			System.out.println("반지름이 " + (int)radius + "인 원입니다.");
		}else
			System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}

class Circle6 {
	private double radius;

	public Circle6(double radius) {
		this.radius = radius;
	}

	public String toString() {
		double area = radius * radius * Math.PI;
		return String.valueOf((int) (area * 1000) / 1000.0);
	}
}